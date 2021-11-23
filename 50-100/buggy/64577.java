public org.restlet.engine.resource.ThrowableAnnotationInfo getThrowableAnnotationInfo(java.lang.reflect.Method javaMethod, int errorCode) {
    for (java.lang.Class<?> clazz : javaMethod.getExceptionTypes()) {
        org.restlet.engine.resource.ThrowableAnnotationInfo tai = getThrowableAnnotationInfo(clazz);
        if ((tai.getStatus().getCode()) == errorCode) {
            return tai;
        }
    }
    return null;
}