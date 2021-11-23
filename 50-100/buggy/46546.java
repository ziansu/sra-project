@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent arg0) {
    java.lang.System.out.println("GENERIC METHOD");
    if (javax.swing.SwingUtilities.isRightMouseButton(arg0)) {
        mineSweeper.views.MainGUI.MyMouseEvents.right = false;
        java.lang.System.out.println("right depressed");
    }
    if (javax.swing.SwingUtilities.isLeftMouseButton(arg0)) {
        mineSweeper.views.MainGUI.MyMouseEvents.left = false;
        mineSweeper.views.MainGUI.MyMouseEvents.leftReleasedMilliSecondsStart = java.lang.System.currentTimeMillis();
        java.lang.System.out.println("left depressed");
    }
}