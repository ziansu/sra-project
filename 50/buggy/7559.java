@java.lang.Override
public void mouseReleased(final java.awt.event.MouseEvent ev) {
    selectSWCColor(swcColor);
    javax.swing.MenuSelectionManager.defaultManager().clearSelectedPath();
    doSelection();
}