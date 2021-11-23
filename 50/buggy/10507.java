@java.lang.Override
public void info(java.lang.String s) {
    if ((underlyingLogger) == null) {
        java.lang.System.out.println(s);
    }
    underlyingLogger.info(s);
}