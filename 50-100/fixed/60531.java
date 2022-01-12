@java.lang.Override
public java.util.Iterator<org.apache.lucene.search.ScoreDoc> getFlushingIterator(boolean unordered, boolean reuseScoreDoc) {
    boolean directIteration = unordered;
    if ((!unordered) && (dirty)) {
        if ((size()) > 1) {
            java.util.Arrays.sort(elements, 1, ((size) + 1));
        }
        directIteration = true;
    }
    return directIteration ? new org.apache.lucene.search.HitQueuePacked.HQIteratorDirect(reuseScoreDoc) : new org.apache.lucene.search.HitQueuePacked.HQIterator(reuseScoreDoc);
}