private boolean isNotTraditionalGetter(java.lang.reflect.Method method) {
    return ((((method.getParameterTypes().length) != 0) || (java.lang.Void.class.equals(method.getReturnType()))) || (!(method.getName().startsWith("get")))) || (!(method.getName().startsWith("is")));
}