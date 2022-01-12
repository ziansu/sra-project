private void mnuQuitOnActionPerformed(java.awt.event.ActionEvent evt) {
    if (isConnected) {
        if ((javax.swing.JOptionPane.YES_OPTION) == (javax.swing.JOptionPane.showConfirmDialog(this, "Do you really wanna quit?", "Quiting...", javax.swing.JOptionPane.YES_NO_OPTION))) {
            try {
                spreadchat.model.Connection.getInstance().disconnect();
                java.lang.System.exit(0);
            } catch (spread.SpreadException ex) {
                java.util.logging.Logger.getLogger(spreadchat.view.MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }else
        java.lang.System.exit(0);
    
}