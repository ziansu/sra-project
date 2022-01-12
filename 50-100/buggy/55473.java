@java.lang.Override
public void debug(java.lang.String tag, java.lang.String message, java.lang.Throwable exception) {
    if ((logLevel) >= (LOG_DEBUG)) {
        java.lang.String msg = (tag + ": ") + message;
        org.parallax3d.parallax.platforms.gwt.GwtApp.logger.log(java.util.logging.Level.FINE, msg, exception);
        java.lang.System.out.println(((msg + "\n") + (exception.getMessage())));
        java.lang.System.out.println(getStackTrace(exception));
    }
}