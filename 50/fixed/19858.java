public void fetchCalls(java.lang.String filter) {
    cancelFetch();
    fetchCalls(com.android.dialer.calllog.CallLogQueryHandler.QUERY_CALLLOG_TOKEN, filter);
}