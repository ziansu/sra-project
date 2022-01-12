@org.testng.annotations.Test
public void testIntersectExpandLet() {
    com.orientechnologies.orient.core.sql.query.OSQLSynchQuery sql = new com.orientechnologies.orient.core.sql.query.OSQLSynchQuery(("select expand(intersect($q1, $q2)) " + ("let $q1 = (select from OUser where name ='admin')," + "$q2 = (select from OUser where name ='admin')")));
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> results = db.query(sql);
    org.testng.Assert.assertEquals(results.size(), 1);
    for (int i = 0; i < (results.size()); i++) {
        com.orientechnologies.orient.core.record.impl.ODocument doc = results.get(i);
        org.testng.Assert.assertEquals(doc.field("name"), "admin");
    }
}