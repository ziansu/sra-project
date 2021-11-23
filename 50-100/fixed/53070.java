@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    int command = java.lang.Integer.parseInt(e.getActionCommand());
    java.lang.System.out.println(command);
    javax.swing.JComboBox box = ((javax.swing.JComboBox) (e.getSource()));
    java.lang.String item = ((java.lang.String) (box.getSelectedItem()));
    java.lang.System.out.println(item);
    argIds[command] = item.split(mae.MaeMain.COMBO_DELIMITER)[1];
    argTypes[command] = item.split(mae.MaeMain.COMBO_DELIMITER)[0];
}