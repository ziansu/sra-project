public synchronized void finishLoadingNext(boolean showBottomErrorView, int dataInserted, boolean keepLoading) {
    if (mIsLoadingNext.getAndSet(false)) {
        mAdapter.showBottomLoading(false);
        if (showBottomErrorView) {
            mAdapter.showBottomError(true);
        }else {
            if (dataInserted > 0) {
                int itemCount = mAdapter.getAdapterItemCount();
                mAdapter.notifyDataItemRangeInserted((itemCount - dataInserted), dataInserted);
            }
            if (keepLoading) {
                checkLoadNext();
            }
        }
    }
}