public final void postCollection() throws java.io.IOException {
    collectableSubAggregators.postCollection();
    doPostCollection();
}