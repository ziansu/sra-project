@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent arg0) {
    switchToSnap(java.lang.Math.max(1, ((currentSnap) - (java.lang.Integer.valueOf(txtFramerate.getText())))));
    notifyJump(java.lang.Math.max(java.lang.Math.min(((currentSnap) + (java.lang.Integer.valueOf(txtFramerate.getText()))), ((graph.getSnapCol().getMaxNum()) - 1)), 1));
}