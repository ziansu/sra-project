private boolean isReflection(final java.lang.StackTraceElement s) {
    try {
        return com.sun.mail.util.logging.LogManagerProperties.isReflectionClass(s.getClassName());
    } catch (java.lang.RuntimeException ignore) {
    } catch (java.lang.Exception | java.lang.LinkageError ignore) {
    }
    return (s.getClassName().startsWith("java.lang.reflect.")) || (s.getClassName().startsWith("sun.reflect."));
}