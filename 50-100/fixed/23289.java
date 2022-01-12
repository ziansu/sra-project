@org.junit.Test
public void testRemoveEgressInterface() {
    testRouteAddToNoVlan();
    org.onosproject.net.intent.MultiPointToSinglePointIntent removedIntent = createIntentToThreeSrcOneTwo(org.onosproject.sdnip.SdnIpFibTest.PREFIX1);
    reset(intentSynchronizer);
    intentSynchronizer.withdraw(org.onosproject.routing.TestIntentServiceHelper.eqExceptId(removedIntent));
    replay(intentSynchronizer);
    org.onosproject.incubator.net.intf.Interface intf = new org.onosproject.incubator.net.intf.Interface("sw3-eth1", org.onosproject.sdnip.SdnIpFibTest.SW3_ETH1, java.util.Collections.singletonList(org.onosproject.sdnip.SdnIpFibTest.IIP3), org.onosproject.sdnip.SdnIpFibTest.MAC3, org.onlab.packet.VlanId.NONE);
    org.onosproject.incubator.net.intf.InterfaceEvent intfEvent = new org.onosproject.incubator.net.intf.InterfaceEvent(InterfaceEvent.Type.INTERFACE_REMOVED, intf);
    interfaceListener.event(intfEvent);
    verify(intentSynchronizer);
}