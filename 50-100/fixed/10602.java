protected boolean setCurrentNetworkView(final org.cytoscape.view.model.CyNetworkView newView) {
    synchronized(lock) {
        if ((((currentNetworkView) == null) && (newView == null)) || (((currentNetworkView) != null) && (currentNetworkView.equals(newView))))
            return false;
        
        final org.cytoscape.view.model.CyNetworkView oldView = currentNetworkView;
        currentNetworkView = newView;
        for (org.cytoscape.internal.view.NetworkViewGrid.ThumbnailPanel tp : thumbnailPanels.values())
            tp.update(false);
        
        firePropertyChange("currentNetworkView", oldView, newView);
    }
    return true;
}