public void recycle() {
    if (!(mRecycled)) {
        mRecycled = true;
        clear();
        mScaledBitmap.recycle();
        synchronized(this) {
            mDecoder.recycle();
        }
    }
}