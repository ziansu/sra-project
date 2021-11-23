void read(TestGenerator.ArgumentCache.GraphAdapterBuilder.Graph graph) throws java.io.IOException {
    if ((graph.nextCreate) != null) {
        java.lang.System.out.println(graph.nextCreate.id);
        graph.nextCreate = null;
    }
    graph.nextCreate = this;
    java.lang.System.out.printf("$[%s]$ADAPTER: %s\n%s\n\n", id, typeAdapter, element);
    value = typeAdapter.fromJsonTree(element);
    java.lang.System.out.printf("$$END %s\n%s\n\n", id, value.getClass());
    if ((value) == null) {
        throw new java.lang.IllegalStateException(("non-null value deserialized to null: " + (element)));
    }
}