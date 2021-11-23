protected static java.lang.String createUniqueName(final org.cytoscape.view.model.CyNetworkView view) {
    return ((((view.getModel().getSUID()) + "__") + (view.getRendererId())) + "__") + (view.hashCode());
}