@java.lang.Override
public org.elasticsearch.search.aggregations.LeafBucketCollector getLeafCollector(org.apache.lucene.index.LeafReaderContext ctx, final org.elasticsearch.search.aggregations.LeafBucketCollector sub) throws java.io.IOException {
    globalOrds = valuesSource.globalOrdinalsValues(ctx);
    if (((acceptedGlobalOrdinals) == null) && ((includeExclude) != null)) {
        acceptedGlobalOrdinals = includeExclude.acceptedGlobalOrdinals(globalOrds, valuesSource);
    }
    if ((acceptedGlobalOrdinals) != null) {
        globalOrds = new org.elasticsearch.search.aggregations.bucket.terms.GlobalOrdinalsStringTermsAggregator.FilteredOrdinals(globalOrds, acceptedGlobalOrdinals);
    }
    return newCollector(globalOrds, sub);
}