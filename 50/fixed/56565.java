@org.testng.annotations.Test
public void testBooleanParams() {
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> qResult = db.command(new com.orientechnologies.orient.core.sql.OCommandSQL("select name from TestParams where name = ? and active = ?")).execute("foo", true);
    org.testng.Assert.assertEquals(qResult.size(), 1);
}