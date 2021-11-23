public void setRoute(com.spoiledmilk.ibikecph.navigation.routing_engine.SMRoute route) {
    if ((this.route) != null) {
        this.route.removeListener(this);
    }
    this.route = route;
    if ((route != null) && (enabled)) {
        routeReady();
    }
}