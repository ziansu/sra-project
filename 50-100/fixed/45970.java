private void traverse(final org.deidentifier.arx.framework.lattice.Node node) {
    check(node);
    org.deidentifier.arx.framework.lattice.Node[] successors = node.getSuccessors(true);
    for (int i = 0; i < (successors.length); i++) {
        org.deidentifier.arx.framework.lattice.Node successor = successors[i];
        if (!(successor.hasProperty(Node.PROPERTY_CHECKED))) {
            traverse(successor);
        }
    }
}