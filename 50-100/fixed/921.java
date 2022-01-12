public void setLastException(final java.lang.Exception exception) {
    if (isDisposed())
        return ;
    
    getDisplay().asyncExec(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if (!(errorBar.isDisposed())) {
                errorBar.setException(exception);
            }
        }
    });
}