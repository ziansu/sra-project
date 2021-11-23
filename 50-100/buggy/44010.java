private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    try {
        java.lang.String[] receivedData = owner.ftp.receiveData("LIST");
        for (java.lang.String aReceivedData : receivedData) {
            owner.updateTerminalText(aReceivedData);
        }
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(ftpclient.FTPMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}