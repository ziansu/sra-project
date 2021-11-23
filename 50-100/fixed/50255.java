@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    if ((e.getButton()) == (java.awt.event.MouseEvent.BUTTON2)) {
        openFiles.get(jTabbedPane.indexAtLocation(e.getX(), e.getY())).close(org.incha.ui.texteditor.TextEditor.instance);
    }
    super.mouseClicked(e);
}