@org.junit.Test
public void testInstallFlow() {
    java.lang.String dpnId = "openflow:1";
    java.lang.String tableId1 = "12";
    org.opendaylight.genius.mdsalutil.FlowEntity testFlow1 = createFlowEntity(dpnId, tableId1);
    mdSalMgr.installFlow(testFlow1);
    org.junit.Assert.assertEquals(1, flowFwder.getDataChgCount());
    java.lang.String tableId2 = "13";
    org.opendaylight.genius.mdsalutil.FlowEntity testFlow2 = createFlowEntity(dpnId, tableId2);
    mdSalMgr.installFlow(testFlow2);
    org.junit.Assert.assertEquals(2, flowFwder.getDataChgCount());
}