public void fetchCalls(int token, int requestId, java.lang.String filter) {
    java.lang.String selection = ((((((("(" + (android.provider.CallLog.Calls.NUMBER)) + " like '%") + filter) + "%'  or  ") + (android.provider.CallLog.Calls.CACHED_NAME)) + " like '%") + filter) + "%' )";
    startQuery(token, requestId, Calls.CONTENT_URI_WITH_VOICEMAIL, CallLogQuery._PROJECTION, selection, null, Calls.DEFAULT_SORT_ORDER);
}