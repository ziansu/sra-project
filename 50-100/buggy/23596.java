private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {
    try {
        java.lang.Integer.parseInt(ID.getText());
        java.lang.Integer.parseInt(PhoneNumber.getText());
        java.lang.Double.parseDouble(Salary.getText());
        java.lang.Double.parseDouble(SSK.getText());
        doClose(accounting.software.GUIStaffs.AddPersonnelDialog.RET_OK);
    } catch (java.lang.NumberFormatException ex) {
        javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Error !!", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}