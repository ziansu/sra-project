@org.junit.Test
public void testRemoveFlow() {
    java.lang.String dpnId = "openflow:1";
    java.lang.String tableId = "13";
    org.opendaylight.genius.mdsalutil.FlowEntity testFlow = createFlowEntity(dpnId, tableId);
    mdSalMgr.installFlow(testFlow);
    org.junit.Assert.assertEquals(1, flowFwder.getDataChgCount());
    mdSalMgr.removeFlow(testFlow);
    org.junit.Assert.assertEquals(0, flowFwder.getDataChgCount());
}