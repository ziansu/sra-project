public synchronized void finishLoadingPrevious(boolean showTopErrorView, int dataInserted) {
    if (mLoadingInitial) {
        throw new java.lang.RuntimeException("Cannot finish load previous while loading initial data");
    }
    if (mIsLoadingPrevious.getAndSet(false)) {
        mAdapter.showTopLoading(false);
        if (showTopErrorView) {
            mAdapter.showTopError(true);
        }else
            if (dataInserted > 0) {
                mAdapter.notifyDataItemRangeInserted(0, dataInserted);
            }
        
    }else {
        throw new java.lang.RuntimeException("Cannot finish load previous while not loading previous");
    }
}