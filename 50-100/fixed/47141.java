@java.lang.Override
public void mouseDragged(java.awt.event.MouseEvent e) {
    if ((buttonInUse) == null)
        return ;
    
    buttonInUse.setDimension(new util.panelDimension(e.getX(), e.getY(), buttonInUse.getSize().getWidth(), buttonInUse.getSize().getHeight()));
    gComponent.repaint();
}