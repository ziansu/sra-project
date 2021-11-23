@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String command = e.getActionCommand();
    javax.swing.JComboBox box = ((javax.swing.JComboBox) (e.getSource()));
    java.lang.String item = ((java.lang.String) (box.getSelectedItem()));
    argIds[java.lang.Integer.parseInt(command)] = item.split(mae.MaeMain.COMBO_DELIMITER)[1];
    argTypes[java.lang.Integer.parseInt(command)] = item.split(mae.MaeMain.COMBO_DELIMITER)[0];
}