private java.lang.String getJoinPointClassName(final org.aspectj.lang.ProceedingJoinPoint currentJoinPoint) {
    java.lang.String className = null;
    try {
        className = currentJoinPoint.getSignature().toString();
    } catch (final java.lang.Exception e) {
        e.getStackTrace();
        java.lang.System.out.println(e.getMessage());
        className = e.toString();
    }
    return className;
}