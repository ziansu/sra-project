@org.testng.annotations.Test
public void readTest() {
    java.util.HashMap<java.lang.String, com.yahoo.ycsb.ByteIterator> ret = new java.util.HashMap<java.lang.String, com.yahoo.ycsb.ByteIterator>(10);
    com.yahoo.ycsb.Status result = com.yahoo.ycsb.db.RadosClientTest.radosclient.read(com.yahoo.ycsb.db.RadosClientTest.TABLE_NAME, com.yahoo.ycsb.db.RadosClientTest.KEY0, com.yahoo.ycsb.db.RadosClientTest.DATA.keySet(), ret);
    org.testng.AssertJUnit.assertEquals(Status.OK, result);
    compareMap(ret);
}