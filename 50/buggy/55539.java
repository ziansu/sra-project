public void recycle() {
    if (!(mRecycled)) {
        mRecycled = true;
        clear();
        synchronized(this) {
            mScaledBitmap.recycle();
        }
        mDecoder.recycle();
    }
}