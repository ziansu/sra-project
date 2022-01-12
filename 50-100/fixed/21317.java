@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent evt) {
    javax.swing.JButton btn = ((javax.swing.JButton) (evt.getSource()));
    btn.setVisible(true);
    if ((btnOnPressChosen) != null) {
        textEdit.setText(((textEdit.getText()) + (btnOnPressChosen.getText())));
    }
    for (javax.swing.JButton btnTemp : buttonsOnPress)
        layeredPane.remove(btnTemp);
    
    validate();
    repaint();
}