@org.testng.annotations.Test
public void testParamsInLetSubquery() {
    java.util.Map<java.lang.String, java.lang.Object> params = new java.util.HashMap<java.lang.String, java.lang.Object>();
    params.put("name", "foo");
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> qResult = db.command(new com.orientechnologies.orient.core.sql.OCommandSQL("select from TestParams let $foo = (select name from TestParams where surname = :name) where surname in $foo.name ")).execute(params);
    assertEquals(qResult.size(), 1);
}