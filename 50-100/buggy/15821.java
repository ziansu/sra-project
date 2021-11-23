private void showKeyChangeDlg() {
    setnotesdesktop.ChangeKeyJPanel keyPanel = new setnotesdesktop.ChangeKeyJPanel(this, notes.getPrivateKey());
    javax.swing.JDialog dlg = new javax.swing.JDialog(this, "Edit Private Key", java.awt.Dialog.ModalityType.APPLICATION_MODAL);
    dlg.add(keyPanel);
    dlg.setResizable(false);
    dlg.pack();
    dlg.setLocationRelativeTo(null);
    dlg.setVisible(true);
}