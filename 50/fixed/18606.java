@org.testng.annotations.Test
public void testLimit() {
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> qResult = db.command(new com.orientechnologies.orient.core.sql.OCommandSQL("select from foo limit 3")).execute();
    org.testng.Assert.assertEquals(qResult.size(), 3);
}