private void updateApplicationManager(final org.cytoscape.model.CyNetwork currentNetwork, final org.cytoscape.view.model.CyNetworkView currentView, final java.util.Collection<org.cytoscape.model.CyNetwork> selectedNetworks, final java.util.Collection<org.cytoscape.view.model.CyNetworkView> selectedViews) {
    new java.lang.Thread(() -> {
        final org.cytoscape.application.CyApplicationManager appMgr = serviceRegistrar.getService(org.cytoscape.application.CyApplicationManager.class);
        appMgr.setCurrentNetwork(currentNetwork);
        appMgr.setCurrentNetworkView(currentView);
        appMgr.setSelectedNetworks(new java.util.ArrayList(selectedNetworks));
        appMgr.setSelectedNetworkViews(new java.util.ArrayList(selectedViews));
    }).start();
}