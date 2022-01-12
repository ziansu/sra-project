@org.testng.annotations.Test
public void testDoNotUseIndexWithOrNotIndexed() throws java.lang.Exception {
    long idxUsagesBefore = indexUsages(db);
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> qResult = db.command(new com.orientechnologies.orient.core.sql.OCommandSQL("select * from foo where bar = 2 or notIndexed = 3")).execute();
    org.testng.Assert.assertEquals(indexUsages(db), idxUsagesBefore);
}