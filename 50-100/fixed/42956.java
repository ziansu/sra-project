@org.junit.Test
public void testRemoveFlow() throws java.lang.Exception {
    java.lang.String dpnId = "openflow:1";
    java.lang.String tableId = "13";
    org.opendaylight.genius.mdsalutil.FlowEntity testFlow = createFlowEntity(dpnId, tableId);
    mdSalMgr.installFlow(testFlow).get();
    org.junit.Assert.assertEquals(1, flowFwder.getDataChgCount());
    mdSalMgr.removeFlow(testFlow).get();
    org.junit.Assert.assertEquals(0, flowFwder.getDataChgCount());
}