protected java.lang.String getClassAndMethodAsString(org.aspectj.lang.JoinPoint joinPoint) {
    return java.lang.String.format("%s.%s()", joinPoint.getSignature().getDeclaringType().getSimpleName(), joinPoint.getSignature().getName());
}