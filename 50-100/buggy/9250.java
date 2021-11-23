@org.testng.annotations.Test
public void testLinkListSequence1() {
    com.orientechnologies.orient.core.sql.query.OSQLSynchQuery sql = new com.orientechnologies.orient.core.sql.query.OSQLSynchQuery("select expand(children.children.children) from LinkListSequence where name = 'root'");
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> results = db.query(sql);
    assertEquals(results.size(), 4);
    for (com.orientechnologies.orient.core.record.impl.ODocument result : results) {
        java.lang.String value = result.field("name");
        assertEquals(value.length(), 5);
    }
}