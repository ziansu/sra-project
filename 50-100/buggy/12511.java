@org.junit.Test
public void testRouteDelete() {
    testRouteAddToNoVlan();
    org.onosproject.incubator.net.routing.ResolvedRoute route = new org.onosproject.incubator.net.routing.ResolvedRoute(org.onosproject.sdnip.SdnIpFibTest.PREFIX1, org.onosproject.sdnip.SdnIpFibTest.IP3, org.onosproject.sdnip.SdnIpFibTest.MAC3, org.onosproject.sdnip.SdnIpFibTest.SW3_ETH1);
    org.onosproject.net.intent.MultiPointToSinglePointIntent removedIntent = createIntentToThreeSrcOneTwo(org.onosproject.sdnip.SdnIpFibTest.PREFIX1);
    org.easymock.EasyMock.reset(intentSynchronizer);
    intentSynchronizer.withdraw(org.onosproject.routing.TestIntentServiceHelper.eqExceptId(removedIntent));
    org.easymock.EasyMock.replay(intentSynchronizer);
    routeListener.event(new org.onosproject.incubator.net.routing.RouteEvent(RouteEvent.Type.ROUTE_REMOVED, route));
    org.easymock.EasyMock.verify(intentSynchronizer);
}