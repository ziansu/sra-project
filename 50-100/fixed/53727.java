@java.lang.Override
protected java.util.List<com.shier2nd.android.latestdiscounts.DiscountItem> doInBackground(java.lang.Integer... params) {
    com.shier2nd.android.latestdiscounts.SmzdmFetchr fetchr = new com.shier2nd.android.latestdiscounts.SmzdmFetchr();
    if ((mQuery) == null) {
        return fetchr.fetchHomeDiscounts(params[0], mLastItemTimeSort);
    }else {
        return fetchr.searchDiscounts((((params[0]) - 1) * 20), mQuery);
    }
}