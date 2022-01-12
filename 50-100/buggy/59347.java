@org.testng.annotations.Test
public void testCompositeIndex() {
    long idxUsagesBefore = indexUsages(db);
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> qResult = db.command(new com.orientechnologies.orient.core.sql.OCommandSQL("select * from foo where comp = 'a' and osite = 1")).execute();
    assertEquals(qResult.size(), 1);
    assertEquals(indexUsages(db), (idxUsagesBefore + 1));
}