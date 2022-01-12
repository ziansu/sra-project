public boolean checkIfProjectRegistrantExist(java.lang.Long projectId, java.lang.String email) {
    org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder searchQueryBuilder = new org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder();
    searchQueryBuilder.withQuery(org.elasticsearch.index.query.QueryBuilders.boolQuery().must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("registrantEmail", email)).must(org.elasticsearch.index.query.QueryBuilders.termQuery("projectId", projectId)).must(org.elasticsearch.index.query.QueryBuilders.termQuery("mailSent", true)));
    long total = projectRegistrantRepository.search(searchQueryBuilder.build()).getTotalElements();
    return total > 0;
}