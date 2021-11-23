private void cancelDueToException(java.lang.Exception e) {
    if (cancelled)
        return ;
    
    cancelled = true;
    android.util.Log.w(org.floens.chan.utils.FileCache.TAG, "IOException downloading file", e);
    purgeOutput();
    post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            callback.onProgress(0, 0, true);
            callback.onFail(false);
        }
    });
}