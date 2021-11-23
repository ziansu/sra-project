@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    super.mouseClicked(e);
    color.setForeground(javax.swing.JColorChooser.showDialog(panel1, "Choose a color", color.getForeground()));
}