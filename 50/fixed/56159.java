@java.lang.Override
public boolean onRequestFailed(android.content.Context context, com.firexweb.newsi.sync.Request request, int requestStatusCode, java.lang.String requestStatusMessage) {
    android.util.Log.e(com.firexweb.newsi.sync.NewsiOperations.ERROR_LOG_TITLE, ("Oh shit, We Failed to fetch Article! The issue was " + requestStatusMessage));
    com.firexweb.newsi.MainSystem.refreshArticle();
    return true;
}