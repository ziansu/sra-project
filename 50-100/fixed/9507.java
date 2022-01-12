public java.lang.Object intercept(cn.dreampie.route.core.RouteInvocation ri) {
    cn.dreampie.common.http.HttpRequest request = ri.getRouteMatch().getRequest();
    cn.dreampie.common.http.HttpResponse response = ri.getRouteMatch().getResponse();
    cn.dreampie.route.interceptor.security.Session oldSession = sessionBuilder.in(request);
    cn.dreampie.route.interceptor.security.Subject.check(request.getHttpMethod(), request.getRestPath());
    java.lang.Object result = ri.invoke();
    sessionBuilder.out(oldSession, response);
    sessionBuilder.buildSessionMetadata(request, oldSession);
    return result;
}