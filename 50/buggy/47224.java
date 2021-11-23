private boolean matchesArity(java.lang.reflect.Method method) {
    int parameterCount = method.getParameterTypes().length;
    return (parameterCount == (arity)) || ((method.isVarArgs()) && (parameterCount <= (arity)));
}