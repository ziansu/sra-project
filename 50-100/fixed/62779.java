@java.lang.Override
@com.google.inject.persist.Transactional
public java.lang.Long tradeCount(com.acuo.common.model.ids.PortfolioId portfolioId) {
    java.lang.String query = "MATCH (portfolio:Portfolio {id:{id}})<-[:BELONGS_TO]-(trade:Trade) " + "RETURN count(trade) as count";
    final com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> parameters = com.google.common.collect.ImmutableMap.of("id", portfolioId.toString());
    org.neo4j.ogm.model.Result result = sessionProvider.get().query(query, parameters);
    java.util.Map<java.lang.String, java.lang.Object> next = result.iterator().next();
    return ((java.lang.Long) (next.get("count")));
}