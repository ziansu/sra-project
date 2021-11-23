@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    if (setNodeSelected(e.getPoint()))
        return ;
    
    setRouteSelected(e.getPoint());
}