public void addRoute(java.lang.Class<?> target, java.lang.reflect.Method execMethod, java.lang.String url, blade.route.HttpMethod method) {
    blade.route.RouteMatcher entry = new blade.route.RouteMatcher();
    entry.target = target;
    entry.execMethod = execMethod;
    entry.httpMethod = method;
    entry.path = url;
    entry.requestURI = url;
    if (blade.Blade.debug()) {
        blade.route.DefaultRouteMatcher.LOGGER.debug(("Add Route：" + entry));
    }
    routes.add(entry);
}