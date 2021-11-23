private void updateApplicationManager(final org.cytoscape.model.CyNetwork currentNetwork, final org.cytoscape.view.model.CyNetworkView currentView, final java.util.Collection<org.cytoscape.model.CyNetwork> selectedNetworks, final java.util.Collection<org.cytoscape.view.model.CyNetworkView> selectedViews) {
    new java.lang.Thread(() -> {
        final org.cytoscape.application.CyApplicationManager appMgr = serviceRegistrar.getService(org.cytoscape.application.CyApplicationManager.class);
        appMgr.setSelectedNetworks(new java.util.ArrayList(selectedNetworks));
        appMgr.setCurrentNetwork(currentNetwork);
        appMgr.setSelectedNetworkViews(new java.util.ArrayList(selectedViews));
        appMgr.setCurrentNetworkView(currentView);
    }).start();
}