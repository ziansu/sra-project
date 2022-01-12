public eu.europeana.corelib.definitions.solr.model.Query setFacetsAllowed(boolean allowFacets) {
    this.allowFacets = allowFacets;
    if ((((this.allowFacets) && (null != (requestedTechnicalFacetsList))) && ((requestedTechnicalFacetsList.size()) > 0)) && (!(solrFacetList.contains(SolrFacetType.FACET_TAGS.toString()))))
        solrFacetList.add(SolrFacetType.FACET_TAGS.toString());
    
    return this;
}