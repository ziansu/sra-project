@java.lang.Override
protected org.apache.tinkerpop.gremlin.process.traversal.Traverser.Admin<java.lang.Boolean> processNextStart() throws java.util.NoSuchElementException {
    return this.starts.hasNext() ? this.starts.next().split(java.lang.Boolean.TRUE, this) : this.getTraversal().getTraverserGenerator().generate(java.lang.Boolean.FALSE, ((org.apache.tinkerpop.gremlin.process.traversal.Step) (this)), 1L);
}