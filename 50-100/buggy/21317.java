@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent evt) {
    javax.swing.JButton btn = ((javax.swing.JButton) (evt.getSource()));
    btn.setVisible(true);
    if ((btnOnPressChosen) != null) {
        textEdit.dispatchEvent(new java.awt.event.KeyEvent(textEdit, java.awt.event.KeyEvent.KEY_TYPED, 0, 0, java.awt.event.KeyEvent.VK_UNDEFINED, btnOnPressChosen.getText().charAt(0)));
    }
    for (javax.swing.JButton btnTemp : buttonsOnPress)
        layeredPane.remove(btnTemp);
    
    validate();
    repaint();
}