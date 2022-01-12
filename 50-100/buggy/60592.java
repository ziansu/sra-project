private boolean tripDeviatedFromRoute(bus.Trip trip, bus.Route route) {
    for (bus.Trip path : paths) {
        if (path.name.equals(route.name)) {
            return bus.PathDetector.tripFollowsPath(trip, path);
        }
    }
    throw new java.lang.RuntimeException((("I do not have " + (route.name)) + " in my path set"));
}