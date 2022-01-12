private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {
    try {
        admins = new Admin.ManageAdmins();
        adminsRS = admins.listAllAdmins();
        tableAdmins.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(adminsRS));
    } catch (java.lang.Exception ex) {
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        btnRemove.setEnabled(false);
        btnRetry.setVisible(true);
        labelConnectionError.setVisible(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }
}