@org.testng.annotations.Test
public void testMatchesWithQuotes() {
    java.lang.String pattern = (java.util.regex.Pattern.quote("adm")) + ".*";
    com.orientechnologies.orient.core.sql.query.OSQLSynchQuery sql = new com.orientechnologies.orient.core.sql.query.OSQLSynchQuery("SELECT FROM matchesstuff WHERE (name matches ?)");
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> results = db.query(sql, pattern);
    org.testng.Assert.assertEquals(results.size(), 1);
}