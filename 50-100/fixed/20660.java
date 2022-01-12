public void actionPerformed(java.awt.event.ActionEvent e) {
    org.cytoscape.model.CyNetwork network = cyNetworkManagerRef.getNetwork(nameToSUID.get(networkDropdown.getSelectedItem()));
    org.cytoscape.view.model.CyNetworkView networkView = ((org.cytoscape.view.model.CyNetworkView) (cyNetworkViewManagerRef.getNetworkViews(network).toArray()[0]));
    java.util.List<org.cytoscape.view.presentation.annotations.Annotation> annotations = annotationManager.getAnnotations(networkView);
    for (org.cytoscape.view.presentation.annotations.Annotation a : annotations) {
        a.removeAnnotation();
    }
    eventHelper.flushPayloadEvents();
    networkView.updateView();
}