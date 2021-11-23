public com.cs130.routerunner.Routes.Route getRoute(com.cs130.routerunner.Actor truck) {
    com.cs130.routerunner.Routes.Route r = new com.cs130.routerunner.Routes.Route(truck);
    r.setWayPoints(wayPoints);
    return r;
}