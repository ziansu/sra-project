public java.lang.Throwable appendTo(java.lang.Throwable throwable) {
    java.lang.Throwable t = throwable;
    while ((t.getCause()) != null) {
        t = t.getCause();
        if (((logLevel) == (com.tspoon.traceur.Traceur.LogLevel.SHOW_ONLY_FIRST)) && (t instanceof com.tspoon.traceur.TraceurException)) {
            return throwable;
        }
    } 
    t.initCause(this);
    return throwable;
}