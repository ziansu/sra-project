public boolean add(io.github.endreman0.javajson.nodes.Node node) {
    if (node != null) {
        node.remove();
        children.add(node);
        node.parent = this;
        return true;
    }
    return false;
}