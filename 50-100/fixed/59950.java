@org.testng.annotations.Test
public void testMaxLongNumber() {
    com.orientechnologies.orient.core.sql.query.OSQLSynchQuery sql = new com.orientechnologies.orient.core.sql.query.OSQLSynchQuery("select from MaxLongNumberTest WHERE last < 10 OR last is null");
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> results = db.query(sql);
    org.testng.Assert.assertEquals(results.size(), 3);
    db.command(new com.orientechnologies.orient.core.sql.OCommandSQL("update MaxLongNumberTest set last = max(91,ifnull(last,0))")).execute();
    sql = new com.orientechnologies.orient.core.sql.query.OSQLSynchQuery("select from MaxLongNumberTest WHERE last < 10 OR last is null");
    results = db.query(sql);
    org.testng.Assert.assertEquals(results.size(), 0);
}