@org.testng.annotations.Test
public void testBacktick() {
    com.orientechnologies.orient.core.sql.query.OSQLSynchQuery sql = new com.orientechnologies.orient.core.sql.query.OSQLSynchQuery("SELECT `foo-bar` as r from TestBacktick");
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> results = db.query(sql);
    assertEquals(results.size(), 1);
    com.orientechnologies.orient.core.record.impl.ODocument doc = results.get(0);
    assertEquals(doc.field("r"), 10);
}