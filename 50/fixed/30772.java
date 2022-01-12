@org.springframework.web.bind.annotation.ExceptionHandler(value = java.lang.Exception.class)
public void defaultExceptionHandler(java.lang.Exception e) throws java.lang.Exception {
    logger.error(null, e);
    if ((org.springframework.core.annotation.AnnotationUtils.findAnnotation(e.getClass(), org.springframework.web.bind.annotation.ResponseStatus.class)) != null) {
        throw e;
    }
}