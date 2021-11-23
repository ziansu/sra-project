@java.lang.Override
public java.lang.Object resolveArgument(org.springframework.core.MethodParameter parameter, org.springframework.web.method.support.ModelAndViewContainer mavContainer, org.springframework.web.context.request.NativeWebRequest webRequest, org.springframework.web.bind.support.WebDataBinderFactory binderFactory) throws java.lang.Exception {
    java.lang.Object object = webRequest.getAttribute(AuthorizationInterceptor.REQUEST_CURRENT_KEY, RequestAttributes.SCOPE_REQUEST);
    if (object != null) {
        java.lang.String key = java.lang.String.valueOf(object);
        java.lang.Object userModel = userModelRepository.getCurrentUser(key);
        if (userModel != null) {
            return userModel;
        }
    }
    throw new org.springframework.web.multipart.support.MissingServletRequestPartException(com.scienjus.authorization.interceptor.AuthorizationInterceptor.REQUEST_CURRENT_KEY);
}