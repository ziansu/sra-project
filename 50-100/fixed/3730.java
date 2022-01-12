private void publishProgress(final yzx.ook.lib.OKDownLoadCallback callback, final long total, final long current) {
    mHandler.post(new java.lang.Runnable() {
        public void run() {
            try {
                int p = ((int) ((1000 * current) / total));
                callback.onProgress((p > 1000 ? 1000 : p < 0 ? 0 : p));
            } catch (java.lang.Exception e) {
                callback.onProgress(1000);
            }
        }
    });
}