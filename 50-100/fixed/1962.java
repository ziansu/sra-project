private java.util.Map<java.lang.String, java.lang.Object> getErrorAttributes(javax.servlet.http.HttpServletRequest request, boolean includeStackTrace) {
    org.springframework.web.context.request.RequestAttributes requestAttributes = new org.springframework.web.context.request.ServletRequestAttributes(request);
    java.util.Map<java.lang.String, java.lang.Object> errorAttributesMap = this.errorAttributes.getErrorAttributes(requestAttributes, includeStackTrace);
    errorAttributesMap.put(com.grndctl.controllers.CustomErrorController.MESSAGE, ((errorAttributes.getError(requestAttributes)) != null ? errorAttributes.getError(requestAttributes).getLocalizedMessage() : null));
    return errorAttributesMap;
}