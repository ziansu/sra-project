private void publishProgress(final yzx.ook.lib.OKDownLoadCallback callback, final long total, final long current) {
    android.util.Log.e("---->>", ((total + "    ") + current));
    mHandler.post(new java.lang.Runnable() {
        public void run() {
            try {
                callback.onProgress(((int) ((1000 * current) / total)));
            } catch (java.lang.Exception e) {
                callback.onProgress(1000);
            }
        }
    });
}