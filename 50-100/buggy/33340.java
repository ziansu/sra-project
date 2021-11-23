@org.testng.annotations.Test
public void testProjection2() {
    long idxUsagesBefore = indexUsages(db);
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> qResult = db.command(new com.orientechnologies.orient.core.sql.OCommandSQL("select a from foo where name = 'a' or bar = 2")).execute();
    assertEquals(qResult.size(), 2);
    assertEquals(indexUsages(db), (idxUsagesBefore + 2));
}