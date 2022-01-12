public void showUpdateDialog() {
    int dialogButton = javax.swing.JOptionPane.YES_NO_OPTION;
    int dialogResult = javax.swing.JOptionPane.showConfirmDialog(null, "JMupen update available. Wanna install? It's matter of seconds.", "Update Available", dialogButton);
    if (dialogResult == (javax.swing.JOptionPane.YES_OPTION)) {
        jmupen.JMupenUpdater.installUpdate();
    }
}