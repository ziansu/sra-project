public void setLastException(final java.lang.Exception exception) {
    getDisplay().asyncExec(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if (!(errorBar.isDisposed())) {
                errorBar.setException(exception);
            }
        }
    });
}