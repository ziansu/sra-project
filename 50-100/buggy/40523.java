public void addInterceptor(blade.route.Router router, java.lang.String url, blade.route.HttpMethod method, java.lang.String acceptType) {
    blade.route.RouteMatcher entry = new blade.route.RouteMatcher();
    entry.router = router;
    entry.httpMethod = method;
    entry.path = url;
    entry.requestURI = url;
    if (blade.Blade.debug()) {
        blade.route.DefaultRouteMatcher.LOGGER.debug(("Add Interceptor：" + entry));
    }
    interceptors.add(entry);
}