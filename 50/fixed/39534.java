public void testBuildGoodQuery() {
    org.intermine.webservice.server.query.result.PathQueryBuilder pqb = new org.intermine.webservice.server.query.result.PathQueryBuilder();
    pqb.buildQuery(goodXML, schemaUrl, bags);
    assertEquals(expectedGoodQuery.toString(), pqb.getQuery().toString());
}