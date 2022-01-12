@org.junit.Test
public void setRoute_WithAttr1AndEmptyPathOnTableWithoutOutLinks_GetsRouteWithAttr1AndEmptyPath() throws java.lang.Exception {
    simulation.RouteTable routeTable = new simulation.RouteTable(new network.Node(0));
    network.Link outLink = stubLink(1, 2);
    routeTable.setRoute(outLink, stubRoute(0, 1, wrappers.PathWrapper.path()));
    org.hamcrest.MatcherAssert.assertThat(routeTable.getRoute(outLink), is(nullValue()));
}