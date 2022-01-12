private simulation.RouteTable build() {
    simulation.RouteTable table = new simulation.RouteTable(destination, outLinks);
    if (!(routes.isEmpty())) {
        java.util.Iterator<simulation.Route> routeItr = routes.iterator();
        for (network.Link outLink : outLinks) {
            simulation.Route route = routeItr.next();
            route.setDestination(destination);
            table.setRoute(outLink, route);
        }
    }
    return table;
}