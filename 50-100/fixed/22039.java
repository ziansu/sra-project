protected void processResponse(org.springframework.http.ResponseEntity<?> entity, org.springframework.web.context.request.NativeWebRequest webRequest) throws java.lang.Exception {
    org.springframework.core.MethodParameter methodParameter = new org.springframework.core.MethodParameter(returnTypeMethodParam);
    org.springframework.web.method.support.ModelAndViewContainer mavContainer = new org.springframework.web.method.support.ModelAndViewContainer();
    try {
        responseProcessor.handleReturnValue(entity, methodParameter, mavContainer, webRequest);
    } catch (org.springframework.web.HttpMediaTypeNotAcceptableException ex) {
        fallbackResponseProcessor.handleReturnValue(entity, methodParameter, mavContainer, webRequest);
    }
}