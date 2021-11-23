@org.junit.Test
public void testInstallGroup() {
    java.lang.String inport = "2";
    int vlanid = 100;
    org.opendaylight.genius.mdsalutil.GroupEntity grpEntity1 = createGroupEntity(org.opendaylight.genius.test.MdSalUtilTest.Nodeid, inport, vlanid);
    mdSalMgr.installGroup(grpEntity1);
    org.junit.Assert.assertEquals(1, grpFwder.getDataChgCount());
    inport = "3";
    vlanid = 100;
    org.opendaylight.genius.mdsalutil.GroupEntity grpEntity2 = createGroupEntity(org.opendaylight.genius.test.MdSalUtilTest.Nodeid, inport, vlanid);
    mdSalMgr.installGroup(grpEntity2);
    org.junit.Assert.assertEquals(2, grpFwder.getDataChgCount());
}