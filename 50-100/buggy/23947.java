private void btnDeleteActionPerformed(java.awt.event.ActionEvent e) {
    at.becast.youploader.gui.EditAccount.LOG.info("Deleting Account");
    int n = javax.swing.JOptionPane.showConfirmDialog(this, at.becast.youploader.gui.EditAccount.LANG.getString("EditAccount.confirmdelete.message"), at.becast.youploader.gui.EditAccount.LANG.getString("EditAccount.confirmdelete.title"), javax.swing.JOptionPane.OK_CANCEL_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE);
    if (n == (javax.swing.JOptionPane.OK_OPTION)) {
        AccMng.delete(this.id);
        parent.refresh_accounts();
        at.becast.youploader.gui.EditAccount.LOG.info("Account deleted");
        this.setVisible(false);
        this.dispose();
    }
    at.becast.youploader.gui.EditAccount.LOG.info("Account delete canceled");
}