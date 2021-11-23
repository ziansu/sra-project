private void onFailure(co.zync.android.api.Call call, java.lang.Exception e) {
    callback.handleError(new co.zync.android.api.ZyncError((-4), ((("HTTP Error: " + ((e.getCause()) != null ? e.getCause().getClass().getSimpleName() : "null")) + ":") + (e.getMessage()))));
}