public void appendLogUiThread(final java.lang.String string) {
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            appendLog(string, false, false);
        }
    });
}