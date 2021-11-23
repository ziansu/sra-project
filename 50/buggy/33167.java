public static com.rhythm.louie.service.RouteUserDisable disable() {
    com.rhythm.louie.request.RequestContextManager.getRequest().enableRouteUser(false);
    return com.rhythm.louie.service.RouteUserDisable.INSTANCE;
}