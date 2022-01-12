@java.lang.Override
public void trace(java.lang.String s) {
    if ((underlyingLogger) == null) {
        java.lang.System.out.println(s);
    }else {
        underlyingLogger.trace(s);
    }
}