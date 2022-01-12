@java.lang.Override
public void mousePressed(java.awt.event.MouseEvent e) {
    if ((e.getClickCount()) > 1) {
        java.lang.System.out.println(SelectedAI.getSelectedIndex());
        selectedFiles.remove(Files.get(SelectedAI.getSelectedIndex()));
        SelectedAI.remove(SelectedAI.getSelectedIndex());
    }
}