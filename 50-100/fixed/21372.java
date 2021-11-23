@org.junit.Test
public void testRouteUpdatesToNoVlan() {
    testRouteAddToVlan();
    org.onosproject.incubator.net.routing.ResolvedRoute oldRoutePrefix = new org.onosproject.incubator.net.routing.ResolvedRoute(org.onosproject.sdnip.SdnIpFibTest.PREFIX2, org.onosproject.sdnip.SdnIpFibTest.IP1, org.onosproject.sdnip.SdnIpFibTest.MAC1, org.onosproject.sdnip.SdnIpFibTest.SW1_ETH1);
    org.onosproject.incubator.net.routing.ResolvedRoute routePrefix = new org.onosproject.incubator.net.routing.ResolvedRoute(org.onosproject.sdnip.SdnIpFibTest.PREFIX2, org.onosproject.sdnip.SdnIpFibTest.IP3, org.onosproject.sdnip.SdnIpFibTest.MAC3, org.onosproject.sdnip.SdnIpFibTest.SW3_ETH1);
    org.onosproject.net.intent.MultiPointToSinglePointIntent newPrefixIntent = createIntentToThreeSrcOneTwo(org.onosproject.sdnip.SdnIpFibTest.PREFIX2);
    reset(intentSynchronizer);
    intentSynchronizer.submit(org.onosproject.routing.TestIntentServiceHelper.eqExceptId(newPrefixIntent));
    replay(intentSynchronizer);
    routeListener.event(new org.onosproject.incubator.net.routing.RouteEvent(RouteEvent.Type.ROUTE_UPDATED, routePrefix, oldRoutePrefix));
    verify(intentSynchronizer);
}