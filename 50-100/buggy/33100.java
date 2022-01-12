private java.lang.invoke.MethodHandle findMethod(java.lang.String className) {
    try {
        java.lang.Class<?> theClass = classLoader.loadClass(className);
        for (java.lang.reflect.Method method : theClass.getMethods()) {
            if (isCandidate(method)) {
                return toMethodHandle(method);
            }
        }
    } catch (java.lang.ClassNotFoundException ignored) {
    }
    return null;
}