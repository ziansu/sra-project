private void getData(java.lang.String s) {
    if ("下拉刷新".equals(s)) {
        getMicroList(1, true);
        listview.onRefreshComplete();
    }else {
        getMicroList(count, true);
        listview.onLoadMoreComplete();
    }
}