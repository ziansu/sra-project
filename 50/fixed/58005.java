@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    if ((e.getClickCount()) == 2) {
        setCurrentNetworkView(tp.getNetworkView());
        show(tp.getNetworkView());
    }
}