private void jButtonDeleteMailActionPerformed(java.awt.event.ActionEvent evt) {
    if ((jMailTable.getSelectedRow()) >= 0) {
        int row = jMailTable.getSelectedRow();
        emailController.removeEmail(emailList.get(row));
        emailList.remove(jMailTable.getSelectedRow());
        emailTable.fireTableDataChanged();
    }
}