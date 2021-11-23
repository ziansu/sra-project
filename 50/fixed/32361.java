@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    panel.remove(label);
    label = null;
    panel.updateUI();
    panel = null;
}