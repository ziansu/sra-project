@java.lang.Override
public void handleResource(java.lang.String resourcePath, ro.pippo.core.route.RouteContext routeContext) {
    java.net.URL url = getResourceUrl(resourcePath);
    if (url == null) {
        routeContext.getResponse().notFound().commit();
    }else {
        streamResource(url, routeContext);
    }
    routeContext.next();
}