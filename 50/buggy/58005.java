@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    if ((e.getClickCount()) == 2) {
        setCurrentNetworkView(tp.getNetworkView());
        show(org.cytoscape.internal.view.NetworkViewContainer.createUniqueName(tp.getNetworkView()));
    }
}