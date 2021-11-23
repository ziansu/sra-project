@org.testng.annotations.Test
public void testDatesListContainsString() {
    com.orientechnologies.orient.core.sql.query.OSQLSynchQuery sql = new com.orientechnologies.orient.core.sql.query.OSQLSynchQuery("select from OCommandExecutorSQLSelectTest_datesSet where foo contains '2015-10-21'");
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> results = db.query(sql);
    org.testng.Assert.assertEquals(results.size(), 1);
}