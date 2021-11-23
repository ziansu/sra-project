@org.testng.annotations.Test
public void testOrderByEmbeddedParams2() {
    java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<java.lang.String, java.lang.Object>();
    parameters.put("paramvalue", "count");
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> qResult = db.command(new com.orientechnologies.orient.core.sql.OCommandSQL("select from TestParamsEmbedded order by emb[:paramvalue] ASC")).execute(parameters);
    assertEquals(qResult.size(), 2);
    java.util.Map embedded = qResult.get(0).field("emb");
    assertEquals(embedded.get("count"), 0);
}