public java.lang.Object greetings(org.aspectj.lang.ProceedingJoinPoint joinPoint) throws java.lang.Throwable {
    stream.println("hello AOP");
    java.lang.Object obj = joinPoint.proceed();
    stream.println("bye bye AOP");
    return obj;
}