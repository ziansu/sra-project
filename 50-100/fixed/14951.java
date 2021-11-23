@org.testng.annotations.Test
public void testLimitWithNamedParam2() {
    java.util.Map<java.lang.String, java.lang.Object> params = new java.util.HashMap<java.lang.String, java.lang.Object>();
    params.put("limit", 2);
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> qResult = db.command(new com.orientechnologies.orient.core.sql.OCommandSQL("select from foo limit :limit")).execute(params);
    org.testng.Assert.assertEquals(qResult.size(), 2);
}