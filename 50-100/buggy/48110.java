private boolean checkReplaceWith(org.graalvm.compiler.graph.Node other) {
    if (((graph) != null) && (graph.isFrozen())) {
        fail("cannot modify frozen graph");
    }
    if (other == (this)) {
        fail("cannot replace a node with itself");
    }
    if (!(isDeleted())) {
        fail("cannot replace deleted node");
    }
    if ((other != null) && (other.isDeleted())) {
        fail("cannot replace with deleted node %s", other);
    }
    return true;
}