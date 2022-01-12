public java.lang.Object dispatchMethod(java.lang.Object host, com.panda.kylin.Kylin kylin, java.lang.String methodName, java.lang.Object[] params) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
    for (java.lang.reflect.Method method : getClass().getDeclaredMethods()) {
        com.panda.kylin.PatchMethodName patchMethodName = method.getAnnotation(com.panda.kylin.PatchMethodName.class);
        if ((methodName.hashCode()) == (patchMethodName.value().hashCode())) {
            return method.invoke(kylin, host);
        }
    }
    return null;
}