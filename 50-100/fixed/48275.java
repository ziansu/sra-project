public java.lang.Class<?> getThrowableClass(java.lang.reflect.Method javaMethod, int errorCode) {
    for (java.lang.Class<?> clazz : javaMethod.getExceptionTypes()) {
        org.restlet.engine.resource.ThrowableAnnotationInfo tai = getThrowableAnnotationInfo(clazz);
        if ((tai != null) && ((tai.getStatus().getCode()) == errorCode)) {
            return clazz;
        }
    }
    return null;
}