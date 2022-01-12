public boolean applyPreDispatch(com.myth.microhttp.http.HttpContextRequest request, com.myth.microhttp.http.HttpContextResponse response) throws java.lang.Exception {
    if (!(org.springframework.util.ObjectUtils.isEmpty(apiInterceptors))) {
        for (int i = 0; i < (apiInterceptors.size()); i++) {
            com.myth.microhttp.mvc.interceptor.ApiInterceptor interceptor = apiInterceptors.get(i);
            if (!(interceptor.preDispatch(request, response))) {
                triggerAfterCompletion(request, response, null);
                return false;
            }
            this.interceptorIndex = i;
        }
    }
    return true;
}