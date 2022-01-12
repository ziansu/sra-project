@java.lang.Override
public void error(java.lang.String tag, java.lang.String message, java.lang.Throwable exception) {
    if ((logLevel) >= (LOG_ERROR)) {
        java.lang.String msg = (tag + ": ") + message;
        org.parallax3d.parallax.platforms.gwt.GwtApp.logger.log(java.util.logging.Level.SEVERE, msg, exception);
        java.lang.System.err.println(msg);
    }
}