public java.lang.Object[] getJoinPointArguments(final org.aspectj.lang.ProceedingJoinPoint currentJoinPoint) {
    java.lang.Object[] joinArgs = null;
    if ((currentJoinPoint.getArgs()) != null) {
        final java.lang.Object[] tmpJoinArgs = currentJoinPoint.getArgs();
        if ((tmpJoinArgs.length) != 0) {
            joinArgs = currentJoinPoint.getArgs();
        }
    }
    return joinArgs;
}