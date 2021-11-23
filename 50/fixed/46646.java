public void fetchCalls(int callType, long newerThan, int sub) {
    cancelFetch();
    fetchCalls(com.android.dialer.calllog.CallLogQueryHandler.QUERY_CALLLOG_TOKEN, callType, false, newerThan, sub);
}