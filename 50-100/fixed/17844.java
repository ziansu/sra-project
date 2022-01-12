@org.testng.annotations.Test
public void testProjection() {
    long idxUsagesBefore = indexUsages(db);
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> qResult = db.command(new com.orientechnologies.orient.core.sql.OCommandSQL("select a from foo where name = 'a' or bar = 1")).execute();
    org.testng.Assert.assertEquals(qResult.size(), 1);
    org.testng.Assert.assertEquals(indexUsages(db), (idxUsagesBefore + 2));
}