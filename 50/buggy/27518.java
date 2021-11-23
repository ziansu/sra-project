@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    temp.setText(javax.swing.JOptionPane.showInputDialog("Change Text", temp.getText()));
    temp = null;
}