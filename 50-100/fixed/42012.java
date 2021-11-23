@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent e) {
    for (int i = 0; i < (dotUI.size()); i++) {
        if (dotUI.get(i).contains(e.getX(), e.getY())) {
            java.lang.System.out.println(("Debug info - Mouse release detected on dot " + i));
        }
    }
    this.lijnUI.clear();
    controller.getVeld().clearConnectedDots();
    repaint();
    java.lang.System.out.println("Mouse release detected");
}