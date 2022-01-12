public void actionPerformed(java.awt.event.ActionEvent evt) {
    try {
        btnOkActionPerformed();
    } catch (java.lang.InterruptedException | java.io.IOException e) {
        at.becast.youploader.gui.AddAccount.LOG.error("Error linking Account", e);
        javax.swing.JOptionPane.showMessageDialog(null, at.becast.youploader.gui.AddAccount.LANG.getString("AddAccount.autherror.message"), at.becast.youploader.gui.AddAccount.LANG.getString("AddAccount.autherror.title"), javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}