@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Object> getErrorAttributes(org.springframework.web.context.request.RequestAttributes requestAttributes, boolean includeStackTrace) {
    java.util.Map<java.lang.String, java.lang.Object> errorAttributes = super.getErrorAttributes(requestAttributes, includeStackTrace);
    java.lang.Throwable error = getError(requestAttributes);
    if (error != null) {
        java.lang.String message = error.getMessage();
        errorAttributes.put("error", message);
    }
    logger.warn(("Error " + (errorAttributes.toString())));
    return errorAttributes;
}