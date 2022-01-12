private simulation.RouteTable build() {
    simulation.RouteTable table = new simulation.RouteTable(outLinks);
    java.util.Iterator<simulation.Route> routeItr = routes.iterator();
    for (network.Node destination : destinations) {
        for (network.Link outLink : outLinks) {
            table.setRoute(destination, outLink, routeItr.next());
        }
    }
    return table;
}