@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    java.lang.Object selected = getPathForRow(getRowForLocation(e.getX(), e.getY())).getLastPathComponent();
    if ((((e.getButton()) == (java.awt.event.MouseEvent.BUTTON1)) && ((e.getClickCount()) == 2)) && (selected instanceof history.FileNode)) {
        versionViewer.setFile(((history.FileNode) (selected)).getFile());
    }
}