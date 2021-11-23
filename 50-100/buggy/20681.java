@java.lang.Override
protected void handleConnectionError(java.lang.Exception e) {
    if ((e != null) && ((e.getMessage()) != null)) {
        java.lang.Throwable cause = e.getCause();
        java.lang.String msg = cause.getMessage().toLowerCase();
        if ((cause instanceof edu.wisc.ssec.mcidas.adde.AddeURLException) && (msg.contains("must be used with archived datasets"))) {
            getArchiveDay();
            return ;
        }
    }
    super.handleConnectionError(e);
}