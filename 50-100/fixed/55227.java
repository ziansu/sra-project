@org.junit.Test
public void testRouteAddToNoVlan() {
    org.onosproject.incubator.net.routing.ResolvedRoute route = new org.onosproject.incubator.net.routing.ResolvedRoute(org.onosproject.sdnip.SdnIpFibTest.PREFIX1, org.onosproject.sdnip.SdnIpFibTest.IP3, org.onosproject.sdnip.SdnIpFibTest.MAC3, org.onosproject.sdnip.SdnIpFibTest.SW3_ETH1);
    org.onosproject.net.intent.MultiPointToSinglePointIntent intent = createIntentToThreeSrcOneTwo(org.onosproject.sdnip.SdnIpFibTest.PREFIX1);
    intentSynchronizer.submit(org.onosproject.routing.TestIntentServiceHelper.eqExceptId(intent));
    replay(intentSynchronizer);
    routeListener.event(new org.onosproject.incubator.net.routing.RouteEvent(RouteEvent.Type.ROUTE_ADDED, route));
    verify(intentSynchronizer);
}