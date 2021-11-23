@org.testng.annotations.Test
public void testCompositeIndex2() {
    long idxUsagesBefore = indexUsages(db);
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> qResult = db.command(new com.orientechnologies.orient.core.sql.OCommandSQL("select * from foo where (comp = 'a' and osite = 1) or name = 'a'")).execute();
    org.testng.Assert.assertEquals(qResult.size(), 2);
    org.testng.Assert.assertEquals(indexUsages(db), (idxUsagesBefore + 2));
}