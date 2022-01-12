@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Object> getErrorAttributes(org.springframework.web.context.request.RequestAttributes requestAttributes, boolean includeStackTrace) {
    java.util.Map<java.lang.String, java.lang.Object> errorAttributes = super.getErrorAttributes(requestAttributes, includeStackTrace);
    java.lang.Throwable error = getError(requestAttributes);
    java.lang.String message = error.getMessage();
    logger.warn(("Error " + message));
    errorAttributes.put("error", message);
    return errorAttributes;
}