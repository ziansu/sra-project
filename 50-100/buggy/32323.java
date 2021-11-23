@org.testng.annotations.Test
public void testParamWithMatches() {
    java.util.Map<java.lang.String, java.lang.Object> params = new java.util.HashMap<java.lang.String, java.lang.Object>();
    params.put("param1", "adm.*");
    com.orientechnologies.orient.core.sql.query.OSQLSynchQuery sql = new com.orientechnologies.orient.core.sql.query.OSQLSynchQuery("select from OUser where name matches :param1");
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> results = db.query(sql, params);
    assertEquals(results.size(), 1);
}