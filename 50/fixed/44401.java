public org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal<S, E> addFile(final byte[] bytes) {
    this.asAdmin().getBytecode().addStep("saveFile", bytes);
    return this;
}