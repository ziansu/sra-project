private void mnuQuitOnActionPerformed(java.awt.event.ActionEvent evt) {
    if (isConnected) {
        if ((javax.swing.JOptionPane.YES_OPTION) == (javax.swing.JOptionPane.showConfirmDialog(this, "Do you really wanna quit?", "Quiting...", javax.swing.JOptionPane.YES_NO_OPTION))) {
            try {
                spreadchat.model.Connection.getInstance().disconnect();
            } catch (spread.SpreadException ex) {
            }
            java.lang.System.exit(0);
        }
    }else
        java.lang.System.exit(0);
    
}