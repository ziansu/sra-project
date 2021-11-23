public void fetchCalls(java.lang.String filter) {
    cancelFetch();
    int requestId = newCallsRequest();
    fetchCalls(com.android.dialer.calllog.CallLogQueryHandler.QUERY_CALLLOG_TOKEN, requestId, filter);
}