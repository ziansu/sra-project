@java.lang.Override
public void warning(java.lang.String s, java.lang.Throwable throwable) {
    if ((underlyingLogger) == null) {
        java.lang.System.out.println(s);
        throwable.printStackTrace();
    }else {
        underlyingLogger.warn(s, throwable);
    }
}