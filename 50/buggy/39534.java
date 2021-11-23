public void testBuildGoodQuery() {
    org.intermine.webservice.server.query.result.PathQueryBuilder pqb = new org.intermine.webservice.server.query.result.PathQueryBuilder();
    pqb.buildQuery(goodXML, schemaUrl, new org.intermine.webservice.server.query.result.PathQueryBuilderTest.ConstantProducer(bags));
    assertEquals(expectedGoodQuery.toString(), pqb.getQuery().toString());
}