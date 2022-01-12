public void invalidate() {
    synchronized(mLock) {
        if (!(mStoped)) {
            (mTag)++;
            mMap.clear();
            mHead.next = mTail;
            mTail.prev = mHead;
        }
    }
}