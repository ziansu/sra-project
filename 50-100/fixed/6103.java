@java.lang.Override
public void onSuccess(java.util.List<java.lang.Object> list, boolean isLoadMore) {
    srGankDay.setRefreshing(false);
    if (!isLoadMore) {
        gankDayList.clear();
    }
    if (list == null) {
        return ;
    }
    gankDayList.addAll(list);
    rvGankDay.getAdapter().notifyDataSetChanged();
    rvGankDay.loadMoreComplete(false);
}