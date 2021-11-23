public void initRequest(blade.route.RouteMatcher match) {
    java.util.List<java.lang.String> requestList = blade.kit.PathKit.convertRouteToList(match.getPath());
    java.util.List<java.lang.String> pathList = blade.kit.PathKit.convertRouteToList(match.getPath());
    this.pathParams = blade.servlet.Request.getPathParams(requestList);
    this.splat = blade.servlet.Request.getSplat(requestList, pathList);
}