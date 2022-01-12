private void assureChecked(final org.deidentifier.arx.framework.lattice.Node node) {
    if (!(node.hasProperty(Node.PROPERTY_CHECKED))) {
        check(node);
    }
}