@java.lang.Override
protected java.lang.Object handleInvocation(java.util.List<java.lang.String> path, java.lang.reflect.Method method) throws java.lang.Throwable {
    lastPath = de.davherrmann.efficiently.immutable.PathRecorder.PathInvocationHandler.pathWith(method);
    final java.lang.Class<?> returnType = method.getReturnType();
    final java.lang.Object defaultValue = com.google.common.base.Defaults.defaultValue(returnType);
    return (defaultValue != null) || (!(returnType.isInterface())) ? defaultValue : pathFor(returnType, lastPath);
}