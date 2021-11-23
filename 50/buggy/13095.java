@org.testng.annotations.Test
public void testQuotedClassName() {
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> qResult = db.command(new com.orientechnologies.orient.core.sql.OCommandSQL("select from `edge`")).execute();
    assertEquals(qResult.size(), 0);
}