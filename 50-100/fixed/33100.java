private java.lang.invoke.MethodHandle findMethod(java.lang.String className) {
    try {
        java.lang.Class<?> theClass = classLoader.loadClass(className);
        for (java.lang.reflect.Method method : theClass.getMethods()) {
            if (isCandidate(method, false)) {
                return toMethodHandle(method);
            }
        }
        for (java.lang.reflect.Method method : theClass.getMethods()) {
            if (isCandidate(method, true)) {
                return toMethodHandle(method);
            }
        }
    } catch (java.lang.ClassNotFoundException ignored) {
    }
    return null;
}