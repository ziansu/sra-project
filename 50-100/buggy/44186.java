private <TYPE> TYPE invoke(java.lang.reflect.Method method, java.lang.Object... args) {
    try {
        return ((TYPE) (method.invoke(implementationObject, args)));
    } catch (java.lang.IllegalAccessException e) {
        throw new java.lang.RuntimeException(e);
    } catch (java.lang.reflect.InvocationTargetException e) {
        throw ((java.lang.RuntimeException) (e.getCause()));
    }
}