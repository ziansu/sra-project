protected void clear() {
    mTotal = 0;
    mLayoutManager.setLayoutHelpers(null);
    for (android.util.Pair<com.alibaba.android.vlayout.DelegateAdapter.AdapterDataObserver, com.alibaba.android.vlayout.DelegateAdapter.Adapter> p : mAdapters) {
        p.second.unregisterAdapterDataObserver(p.first);
    }
    mItemTypeAry.clear();
    mAdapters.clear();
}