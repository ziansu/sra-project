private void cancelDueToHttpError(final int code) {
    if (cancelled)
        return ;
    
    cancelled = true;
    android.util.Log.w(org.floens.chan.utils.FileCache.TAG, ("Cancel due to http error, code: " + code));
    purgeOutput();
    post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            callback.onProgress(0, 0, true);
            callback.onFail((code == 404));
        }
    });
}