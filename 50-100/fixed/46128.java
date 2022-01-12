protected void logException(java.lang.Throwable throwable, int status) {
    java.lang.String msg = "Status " + status;
    if ((uriInfo) != null) {
        msg += " ";
        msg += uriInfo.getRequestUri();
    }
    if ((status >= 400) && (status < 500)) {
        logInfo(msg, throwable);
    }else {
        logError(msg, throwable);
    }
}