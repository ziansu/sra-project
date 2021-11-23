private org.xlrnet.metadict.engines.heinzelnisse.BilingualQueryResult runQuery(java.lang.String queryInput, boolean queryGerman, boolean queryNorwegian) throws java.io.IOException {
    org.xlrnet.metadict.engines.heinzelnisse.BilingualQueryResultBuilder resultBuilder = org.xlrnet.metadict.engines.heinzelnisse.ImmutableBilingualQueryResult.builder();
    org.xlrnet.metadict.engines.heinzelnisse.entities.HeinzelResponse fullResponse = fetchResponse(queryInput, false, queryGerman, queryNorwegian);
    processResponse(fullResponse, resultBuilder, queryGerman, queryNorwegian);
    return resultBuilder.build();
}