protected void retry() {
    com.couchbase.lite.util.Log.v(Log.TAG_SYNC, "[retry()]");
    (retryCount)++;
    this.error = null;
    checkSession();
}