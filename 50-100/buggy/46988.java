@java.lang.Override
public void error(java.lang.String tag, java.lang.String message, java.lang.Throwable ex) {
    android.util.Log.e(tag, message, ex);
    service.addMessage(((message + " : ") + (ex.getMessage())));
    logger.error(tag, message);
}