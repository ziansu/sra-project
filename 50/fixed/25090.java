@java.lang.Override
public void warning(java.lang.String s) {
    if ((underlyingLogger) == null) {
        java.lang.System.out.println(s);
    }else {
        underlyingLogger.warn(s);
    }
}