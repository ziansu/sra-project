@org.testng.annotations.Test
public void testSelectFromClusterNumber() {
    com.orientechnologies.orient.core.metadata.schema.OClass clazz = db.getMetadata().getSchema().getClass("DistinctLimit");
    int firstCluster = clazz.getClusterIds()[0];
    com.orientechnologies.orient.core.sql.query.OSQLSynchQuery sql = new com.orientechnologies.orient.core.sql.query.OSQLSynchQuery((("select from cluster:" + firstCluster) + " limit 1"));
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> results = db.query(sql);
    org.testng.Assert.assertEquals(results.size(), 1);
}