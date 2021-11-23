@com.mlds.core.aspect.Around(value = "log()")
public java.lang.Object doAround(org.aspectj.lang.ProceedingJoinPoint point) throws java.lang.Throwable {
    logger.info("********************************************************************************");
    logger.info("|---------------------------------RequestBegin---------------------------------|");
    java.lang.Object returnValue = point.proceed();
    logger.info(("此处可做一些类似after的工作+" + (returnValue.toString())));
    return returnValue;
}