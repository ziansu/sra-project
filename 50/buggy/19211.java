public void invalidate() {
    synchronized(mLock) {
        if (mStoped)
            return ;
        else {
            (mTag)++;
            mMap.clear();
            mHead.next = mTail;
            mTail.prev = mHead;
        }
    }
}