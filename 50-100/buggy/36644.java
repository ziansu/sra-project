@org.testng.annotations.Test
public void testUseIndexWithOr() throws java.lang.Exception {
    long idxUsagesBefore = indexUsages(db);
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> qResult = db.command(new com.orientechnologies.orient.core.sql.OCommandSQL("select * from foo where bar = 2 or name ='a' and bar >= 0")).execute();
    assertEquals(qResult.size(), 2);
    assertEquals(indexUsages(db), (idxUsagesBefore + 2));
}