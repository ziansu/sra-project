@org.testng.annotations.Test
public void testMultipleClusters() {
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> qResult = db.command(new com.orientechnologies.orient.core.sql.OCommandSQL("select from cluster:[testmultipleclusters1]")).execute();
    assertEquals(qResult.size(), 1);
    qResult = db.command(new com.orientechnologies.orient.core.sql.OCommandSQL("select from cluster:[testmultipleclusters1, testmultipleclusters2]")).execute();
    assertEquals(qResult.size(), 2);
}