public org.cytoscape.internal.view.NetworkViewContainer getCurrentContainer() {
    for (org.cytoscape.internal.view.NetworkViewComparisonPanel.ViewPanel vp : viewPanels.values()) {
        if (currentNetworkView.equals(vp.getNetworkView()))
            return vp.getNetworkViewContainer();
        
    }
    return null;
}