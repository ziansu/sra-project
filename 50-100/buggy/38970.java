@java.lang.SuppressWarnings(value = "empty-statement")
private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    StyleManagement.Validation Val = new StyleManagement.Validation();
    Val.typecheck();
    boolean result = StyleManagement.CreateDesignModel.AddDesign(id, styleDes, jTextField2, jTextField3, jComboBox1, jComboBox2, datePicker2, jCheckBox3, jCheckBox1, jCheckBox2, jCheckBox3, jCheckBox4, jTextField4);
    if (result) {
        javax.swing.JOptionPane.showMessageDialog(null, "Successfully Added To Design", "InfoBox", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        generate_sdi();
        clear();
    }else {
        javax.swing.JOptionPane.showMessageDialog(null, "Failed Added To Design", "InfoBox", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
}