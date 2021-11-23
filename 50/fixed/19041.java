@org.testng.annotations.Test
public void testLimitWithUnnamedParam() {
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> qResult = db.command(new com.orientechnologies.orient.core.sql.OCommandSQL("select from foo limit ?")).execute(3);
    org.testng.Assert.assertEquals(qResult.size(), 3);
}