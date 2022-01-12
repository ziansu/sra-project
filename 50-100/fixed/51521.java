@org.junit.Before
public void setUp() throws java.lang.Exception {
    java.lang.reflect.Field field = org.postgresql.hostchooser.GlobalHostStatusTracker.class.getDeclaredField("hostStatusMap");
    field.setAccessible(true);
    hostStatusMap = new java.util.HashMap<org.postgresql.util.HostSpec, java.lang.Object>(((java.util.Map<org.postgresql.util.HostSpec, java.lang.Object>) (field.get(null))));
    con = org.postgresql.test.TestUtil.openDB();
    masterIp = getRemoteHostSpec();
    org.postgresql.test.TestUtil.closeDB(con);
    con = org.postgresql.test.hostchooser.MultiHostTestSuite.openSlaveDB();
    slaveIp = getRemoteHostSpec();
    org.postgresql.test.TestUtil.closeDB(con);
}