protected static java.lang.String createUniqueName(final org.cytoscape.view.model.CyNetworkView view) {
    return ((((view.getSUID()) + "__") + (view.getRendererId())) + "__") + (view.hashCode());
}