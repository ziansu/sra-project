@java.lang.Override
protected void onSuccess(java.util.List<com.jiuzhang.guojing.dribbbo.model.Shot> shots) {
    adapter.setShowLoading(((shots.size()) >= (com.jiuzhang.guojing.dribbbo.dribbble.Dribbble.COUNT_PER_LOAD)));
    if (refresh) {
        swipeRefreshLayout.setRefreshing(false);
        adapter.setData(shots);
    }else {
        swipeRefreshLayout.setEnabled(true);
        adapter.append(shots);
    }
}