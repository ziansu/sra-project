public void flush() {
    synchronized(this) {
        for (java.lang.ref.SoftReference<com.devsmart.microdb.DBObject> ref : mLiveObjects.values()) {
            com.devsmart.microdb.DBObject obj = ref.get();
            if (obj != null) {
                synchronized(obj) {
                    if (obj.mDirty) {
                        mWriteQueue.enqueue(createWriteObject(obj));
                    }
                }
            }
        }
    }
    sync();
}