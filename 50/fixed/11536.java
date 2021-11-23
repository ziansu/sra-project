@java.lang.Override
public org.apache.solr.request.sparse.ValueCounter createSibling() {
    org.apache.solr.request.sparse.SparseCounterBitmap newCounter = new org.apache.solr.request.sparse.SparseCounterBitmap(counterImpl, ((org.apache.lucene.util.packed.NPlaneMutable) (org.apache.lucene.util.packed.NPlaneMutable.newFromTemplate(counts))), maxCountForAny, minCountsForSparse, fraction, maxCountTracked);
    return newCounter;
}