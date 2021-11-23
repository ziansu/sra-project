@org.junit.Test
public void setRoute_WithAttr1AndEmptyPathOnTableWithoutOutLinks_GetsRouteWithAttr1AndEmptyPath() throws java.lang.Exception {
    network.Node destination = new network.Node(0);
    simulation.RouteTable routeTable = new simulation.RouteTable(destination);
    network.Link outLink = stubLink(1, 2);
    routeTable.setRoute(outLink, stubRoute(0, 1, wrappers.PathWrapper.path()));
    org.hamcrest.MatcherAssert.assertThat(routeTable.getRoute(outLink), is(nullValue()));
}