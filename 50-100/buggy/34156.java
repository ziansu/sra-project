private void logMethod(org.aspectj.lang.JoinPoint joinPoint, java.lang.String logMethod) {
    final java.lang.String methodName = joinPoint.getSignature().getName();
    final java.lang.Object[] params = joinPoint.getArgs();
    monitorAopLog.debug(java.lang.String.format(logMethod, methodName));
    for (java.lang.Object param : params) {
        monitorAopLog.debug(java.lang.String.format(com.jmb.springfactory.LoggerAop.LOG_PARAM, param.toString()));
    }
}