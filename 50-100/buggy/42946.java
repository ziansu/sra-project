@org.aspectj.lang.annotation.Before(value = "classAnnotatedWithRxLogSubscriber(joinPoint) && onNextMethodExecution()")
public void beforeOnNextExecution(org.aspectj.lang.JoinPoint joinPoint) {
    countAndMeasureTime();
    final com.fernandocejas.frodo.joinpoint.FrodoJoinPoint frodoJoinPoint = new com.fernandocejas.frodo.joinpoint.FrodoJoinPoint(joinPoint);
    final java.lang.Object value = frodoJoinPoint.getMethodParamValuesList().get(0);
    messageManager.printSubscriberOnNext(joinPoint.getTarget().getClass().getSimpleName(), value.toString(), java.lang.Thread.currentThread().getName());
}