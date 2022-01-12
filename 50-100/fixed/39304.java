@org.junit.Test
public void testBasicQuery() throws java.lang.Exception {
    org.sagebionetworks.repo.model.entity.query.EntityQuery query = new org.sagebionetworks.repo.model.entity.query.EntityQuery();
    query.setLimit(1L);
    org.sagebionetworks.repo.model.entity.query.EntityQueryResults results = entityQueryManger.executeQuery(query, adminUserInfo);
    org.junit.Assert.assertNotNull(results);
    org.junit.Assert.assertNotNull(results.getEntities());
    org.junit.Assert.assertEquals(1, results.getEntities().size());
    org.junit.Assert.assertTrue(((results.getTotalEntityCount()) >= 3));
}