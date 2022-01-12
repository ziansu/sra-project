private void processDefiniteCandidateElement(org.apache.solr.handler.component.PivotFacet pf, org.apache.solr.handler.component.PivotFacetValue value) {
    for (int shard = pf.knownShards.nextSetBit(0); 0 <= shard; shard = pf.knownShards.nextSetBit((shard + 1))) {
        if (!(value.shardHasContributed(shard))) {
            if ((FacetParams.FACET_SORT_INDEX.equals(facetFieldSort)) || ((null == (value.getValue())) || (numberOfValuesContributedByShardWasLimitedByFacetFieldLimit(shard)))) {
                pf.addRefinement(shard, value);
            }
        }
    }
}