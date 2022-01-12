public void addRouteHandler(java.lang.String method, java.lang.String routeRegexPath, org.voovan.http.server.HttpRouter router) {
    if (methodRouters.keySet().contains(method)) {
        if (routeRegexPath.endsWith("/")) {
            routeRegexPath = org.voovan.http.server.TString.removePrefix(routeRegexPath);
        }
        routeRegexPath = org.voovan.http.server.TString.fastReplaceAll(routeRegexPath, "\\/{2,9}", "/");
        methodRouters.get(method).put(routeRegexPath, router);
    }
}