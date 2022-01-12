protected void setCurrentNetworkView(final org.cytoscape.view.model.CyNetworkView newView) {
    synchronized(lock) {
        if ((((currentNetworkView) == null) && (newView == null)) || (((currentNetworkView) != null) && (currentNetworkView.equals(newView))))
            return ;
        
        final org.cytoscape.view.model.CyNetworkView oldView = currentNetworkView;
        currentNetworkView = newView;
        for (org.cytoscape.internal.view.NetworkViewGrid.ThumbnailPanel tp : thumbnailPanels.values())
            tp.update();
        
        firePropertyChange("currentNetworkView", oldView, newView);
    }
}