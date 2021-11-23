private void testGetEntities(java.lang.String source, java.lang.String... expectedEntities) {
    com.ibm.watson.developer_cloud.alchemy.v1.model.Entities entities = getConnector().entities(buildTestRequest(source, null));
    org.junit.Assert.assertNotNull(entities);
    testPrecenseOf(entities.getEntities(), expectedEntities);
    if (source.equals(TestDataBuilder.TEST_URL)) {
        org.junit.Assert.assertNotNull(entities.getUrl());
    }else {
        assert entities.getUrl().isEmpty();
    }
}