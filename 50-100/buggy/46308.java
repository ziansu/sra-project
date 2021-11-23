@java.lang.Override
public void componentShown(java.awt.event.ComponentEvent e) {
    final org.cytoscape.view.model.CyNetworkView oldView = getCurrentNetworkView();
    if (((oldView == null) && (view == null)) || ((oldView != null) && (oldView.equals(view))))
        return ;
    
    firePropertyChange("currentNetworkView", oldView, view);
}