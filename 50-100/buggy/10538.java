@java.lang.Override
protected void reloadForSearch(boolean finalTouch) {
    if ((mAdapter) == null) {
        return ;
    }
    try {
        final int sD = mData.length;
        for (int i = 0; i < sD; ++i) {
            if (!((mData[i]) instanceof ds.framework.v4.data.AbsRecyclerViewData)) {
                break;
            }
            invalidateData(i);
        }
        loadDataAndDisplay();
    } catch (java.lang.Throwable e) {
        ds.framework.v4.common.Debug.logException(e);
    }
}