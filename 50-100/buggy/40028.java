public java.lang.Object cypherSinglePropertyQuery(java.lang.String query, com.poolingpeople.utils.neo4jApi.boundary.HasQueryParams params) {
    this.logger.log(java.util.logging.Level.FINE, query);
    javax.ws.rs.core.Response response = getCypherBuilder().post(javax.ws.rs.client.Entity.json(com.poolingpeople.utils.neo4jApi.boundary.MultiStatementBuilder.begin().add(helper.getCypherBody(query, params))));
    java.util.List<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>> r = responseParser.parseSimpleStatementOrException(response);
    java.lang.Object res = toSingleProperty(r);
    return res;
}