public void flush() throws java.io.IOException {
    synchronized(this) {
        for (java.lang.ref.SoftReference<com.devsmart.microdb.DBObject> ref : mLiveObjects.values()) {
            com.devsmart.microdb.DBObject obj = ref.get();
            if ((obj != null) && (obj.mDirty)) {
                mWriteQueue.enqueue(createWriteObject(obj));
            }
        }
    }
    sync();
}