public boolean checkIfProjectRegistrantExist(java.lang.Long projectId, java.lang.String email) {
    org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder searchQueryBuilder = new org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder();
    searchQueryBuilder.withQuery(boolQuery().must(matchPhraseQuery("registrantEmail", email)).must(termQuery("projectId", projectId)).must(termQuery("mailSent", true)));
    long total = projectRegistrantRepository.search(searchQueryBuilder.build()).getTotalElements();
    return total > 0;
}