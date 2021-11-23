@java.lang.Override
protected void onSuccess(java.util.List<com.jiuzhang.guojing.dribbbo.model.Shot> shots) {
    if ((shots.size()) < (com.jiuzhang.guojing.dribbbo.dribbble.Dribbble.COUNT_PER_LOAD)) {
        adapter.setShowLoading(false);
    }
    if (refresh) {
        swipeRefreshLayout.setRefreshing(false);
        adapter.setData(shots);
    }else {
        swipeRefreshLayout.setEnabled(true);
        adapter.append(shots);
    }
}