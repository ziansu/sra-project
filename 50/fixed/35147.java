@java.lang.Override
public void setTraversal(final org.apache.tinkerpop.gremlin.process.traversal.Traversal.Admin<?, ?> parentTraversal) {
    super.setTraversal(parentTraversal);
    this.integrateChild(this.dedupTraversal);
}