@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    hideDialog();
    dialogsPanel.reconstruct(Action.ELEMENT_SHRINKS, null);
    hideNotify();
    if ((org.openstreetmap.josm.Main.map) != null) {
        Main.map.requestFocusInWindow();
    }
}