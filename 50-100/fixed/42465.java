@java.lang.Override
protected void onSuccess(java.util.List<com.jiuzhang.guojing.dribbbo.model.Bucket> buckets) {
    adapter.setShowLoading(((buckets.size()) >= (com.jiuzhang.guojing.dribbbo.dribbble.Dribbble.COUNT_PER_LOAD)));
    for (com.jiuzhang.guojing.dribbbo.model.Bucket bucket : buckets) {
        if (collectedBucketIdSet.contains(bucket.id)) {
            bucket.isChoosing = true;
        }
    }
    if (refresh) {
        adapter.setData(buckets);
        swipeRefreshLayout.setRefreshing(false);
    }else {
        adapter.append(buckets);
    }
    swipeRefreshLayout.setEnabled(true);
}