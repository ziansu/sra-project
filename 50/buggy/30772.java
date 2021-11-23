@org.springframework.web.bind.annotation.ExceptionHandler(value = java.lang.Exception.class)
public void defaultExceptionHandler(java.lang.Exception e) throws java.lang.Exception {
    if ((org.springframework.core.annotation.AnnotationUtils.findAnnotation(e.getClass(), org.springframework.web.bind.annotation.ResponseStatus.class)) != null) {
        throw e;
    }
    logger.error(null, e);
}