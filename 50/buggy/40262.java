private void addAggregationFromFacet(org.elasticsearch.action.search.SearchRequestBuilder searchRequestBuilder, uk.ac.ebi.metabolights.search.service.imp.es.Facet facet) {
    org.elasticsearch.search.aggregations.bucket.terms.TermsBuilder facetGroup = new org.elasticsearch.search.aggregations.bucket.terms.TermsBuilder(facet.getName());
    facetGroup.field(facet.getName());
    searchRequestBuilder.addAggregation(facetGroup);
}