@org.testng.annotations.Test
public void testSkipZeroOrdered() {
    com.orientechnologies.orient.core.sql.query.OSQLSynchQuery sql = new com.orientechnologies.orient.core.sql.query.OSQLSynchQuery("SELECT from alphabet ORDER BY letter SKIP 0");
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> results = db.query(sql);
    assertEquals(26, results.size());
}