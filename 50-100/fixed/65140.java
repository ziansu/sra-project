@org.junit.Test
public void testRemoveGroup() throws java.lang.Exception {
    java.lang.String inport = "2";
    int vlanid = 100;
    org.opendaylight.genius.mdsalutil.GroupEntity grpEntity = createGroupEntity(org.opendaylight.genius.test.MdSalUtilTest.Nodeid, inport, vlanid);
    mdSalMgr.installGroup(grpEntity).get();
    org.junit.Assert.assertEquals(1, grpFwder.getDataChgCount());
    mdSalMgr.removeGroup(grpEntity).get();
    org.junit.Assert.assertEquals(0, grpFwder.getDataChgCount());
}