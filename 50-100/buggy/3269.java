public void setAdapter(net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter adapter) {
    if ((mAdapter) == adapter) {
        return ;
    }
    if ((mAdapter) != null) {
        mAdapter.unregisterDataSetObserver(mObserver);
    }
    mAdapter = adapter;
    if ((mAdapter) != null) {
        mAdapter.registerDataSetObserver(mObserver);
        adapter.notifyDataSetChanged();
    }else {
        mNavigatorHelper.setTotalCount(0);
        init();
    }
}