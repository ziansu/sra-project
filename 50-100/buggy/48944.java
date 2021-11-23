@org.testng.annotations.Test
public void testExpandOnEmbedded() {
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> qResult = db.command(new com.orientechnologies.orient.core.sql.OCommandSQL("select expand(address) from foo where name = 'a'")).execute();
    assertEquals(qResult.size(), 1);
    assertEquals(qResult.get(0).field("city"), "NY");
}