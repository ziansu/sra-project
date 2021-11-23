private void logExit(java.lang.reflect.Method targetMethod, java.lang.Object returnValue) {
    java.lang.Object[] args = new java.lang.Object[]{ targetMethod.getDeclaringClass().getCanonicalName() , targetMethod.getName() };
    se.kth.iv1201.utility.logger.LogInterceptor.LOGGER.log(se.kth.iv1201.utility.logger.LogInterceptor.LEVEL, "Call to {0}.{1} completed", args);
    if (!(isVoid(targetMethod))) {
        se.kth.iv1201.utility.logger.LogInterceptor.LOGGER.log(se.kth.iv1201.utility.logger.LogInterceptor.LEVEL, "    Return value: {0}", returnValue.toString());
    }
}