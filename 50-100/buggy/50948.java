@java.lang.Override
public void mousePressed(java.awt.event.MouseEvent e) {
    if ((e.getClickCount()) > 1) {
        SelectedAI.remove(SelectedAI.getSelectedIndex());
        selectedFiles.remove(Files.get(SelectedAI.getSelectedIndex()));
        SelectedAI.deselect(SelectedAI.getSelectedIndex());
    }
}