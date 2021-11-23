private void handleException(final java.lang.Throwable ex) {
    if (ex == null) {
        return ;
    }
    new java.lang.Thread() {
        @java.lang.Override
        public void run() {
            saveLocal(writeLogIntoMarkdown(ex));
        }
    }.start();
}