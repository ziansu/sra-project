@java.lang.Override
public void error(java.lang.String s, java.lang.Throwable throwable) {
    if ((underlyingLogger) == null) {
        java.lang.System.err.println(s);
        throwable.printStackTrace();
    }
    underlyingLogger.error(s, throwable);
}