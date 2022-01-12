public synchronized void finishLoadingNext(boolean showBottomErrorView, int dataInserted, boolean keepLoading) {
    if (mIsLoadingNext.getAndSet(false)) {
        mAdapter.showBottomLoading(false);
        int itemCount = mAdapter.getAdapterItemCount();
        if (showBottomErrorView) {
            mAdapter.showBottomError(true);
        }else {
            if (dataInserted > 0) {
                mAdapter.notifyDataItemRangeInserted((itemCount - dataInserted), dataInserted);
            }
            if (keepLoading) {
                checkLoadNext();
            }
        }
    }
}