@java.lang.Override
public void run() {
    debugLog("repeat collect");
    org.elasticsearch.search.internal.ContextIndexSearcher indexSearcher = searchContext.searcher();
    java.util.Iterator<org.apache.lucene.index.LeafReaderContext> iterator = indexSearcher.getTopReaderContext().leaves().iterator();
    innerCollect(state.collector, state.weight, iterator, null);
}