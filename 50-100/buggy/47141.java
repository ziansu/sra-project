@java.lang.Override
public void mouseDragged(java.awt.event.MouseEvent e) {
    checkButtonInUse(e);
    buttonInUse.setDimension(new util.panelDimension(e.getX(), e.getY(), buttonInUse.getSize().getWidth(), buttonInUse.getSize().getHeight()));
    if (buttonInUse.withIn(buttonInUse.getContainer())) {
        gComponent.repaint();
    }
}