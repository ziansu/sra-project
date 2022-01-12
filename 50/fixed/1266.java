private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {
    email.setFolder(jComboBoxFolders.getSelectedItem().toString());
    java.lang.System.out.println(jComboBoxFolders.getSelectedItem().toString());
    jDialogFolder.setVisible(false);
}