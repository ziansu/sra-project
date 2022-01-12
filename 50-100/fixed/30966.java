void read(TestGenerator.ArgumentCache.GraphAdapterBuilder.Graph graph) throws java.io.IOException {
    if ((graph.nextCreate) != null) {
        graph.nextCreate = null;
    }
    graph.nextCreate = this;
    value = typeAdapter.fromJsonTree(element);
    if ((value) == null) {
        throw new java.lang.IllegalStateException(("non-null value deserialized to null: " + (element)));
    }
}