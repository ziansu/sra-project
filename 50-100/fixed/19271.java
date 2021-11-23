@org.testng.annotations.Test
public void testExpandSkipLimit() {
    com.orientechnologies.orient.core.sql.query.OSQLSynchQuery sql = new com.orientechnologies.orient.core.sql.query.OSQLSynchQuery("SELECT expand(linked) from ExpandSkipLimit where parent = true order by nnum skip 1 limit 1");
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> results = db.query(sql);
    org.testng.Assert.assertEquals(results.size(), 1);
    com.orientechnologies.orient.core.record.impl.ODocument doc = results.get(0);
    org.testng.Assert.assertEquals(doc.field("nnum"), 1);
}