@java.lang.Override
public org.apache.lucene.util.LongBitSet acceptedGlobalOrdinals(org.apache.lucene.index.RandomAccessOrds globalOrdinals) throws java.io.IOException {
    org.apache.lucene.util.LongBitSet acceptedGlobalOrdinals = new org.apache.lucene.util.LongBitSet(globalOrdinals.getValueCount());
    org.apache.lucene.index.TermsEnum globalTermsEnum;
    org.apache.lucene.index.Terms globalTerms = new org.elasticsearch.search.aggregations.bucket.terms.support.IncludeExclude.DocValuesTerms(globalOrdinals);
    globalTermsEnum = compiled.getTermsEnum(globalTerms);
    for (org.apache.lucene.util.BytesRef term = globalTermsEnum.next(); term != null; term = globalTermsEnum.next()) {
        acceptedGlobalOrdinals.set(globalTermsEnum.ord());
    }
    return acceptedGlobalOrdinals;
}