private synchronized void addRoute(java.lang.String action, java.lang.String path, org.rapidoid.http.Handler handler) {
    assert (action.length()) >= 1;
    assert (path.length()) >= 1;
    org.rapidoid.http.HttpRouter.Route route = new org.rapidoid.http.HttpRouter.Route();
    route.handler = handler;
    route.action = action.getBytes();
    route.path = path.getBytes();
    long hash = hash(action, path);
    routes.put(hash, route);
}