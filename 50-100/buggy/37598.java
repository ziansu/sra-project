@java.lang.Override
protected org.apache.tinkerpop.gremlin.process.traversal.Traverser.Admin<java.lang.Boolean> processNextStart() throws java.util.NoSuchElementException {
    if (this.starts.hasNext()) {
        final org.apache.tinkerpop.gremlin.process.traversal.Traverser.Admin<S> s = this.starts.next();
        return s.split(java.lang.Boolean.TRUE, this);
    }else
        return this.getTraversal().getTraverserGenerator().generate(java.lang.Boolean.FALSE, ((org.apache.tinkerpop.gremlin.process.traversal.Step) (this)), 1L);
    
}