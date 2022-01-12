protected java.lang.reflect.Method lookupMethod(java.lang.String className, java.lang.String methodName) {
    try {
        java.lang.Class<?> clazz = java.lang.Class.forName(className);
        return clazz.getMethod(methodName);
    } catch (java.lang.ReflectiveOperationException | java.lang.SecurityException e) {
        org.eclipse.scout.rt.server.jaxws.implementor.JaxWsClientPoolingHelper.LOG.info("Could not find reset method. Falling back to manual request context cleansing. [{}.{}]", className, methodName, e);
    }
    return null;
}