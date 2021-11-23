private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    try {
        java.lang.String[] replyFromServer = owner.ftp.sendCommand("HELP");
        owner.updateTerminalText("\n");
        for (java.lang.String br : replyFromServer) {
            owner.updateTerminalText(br);
        }
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(ftpclient.FTPMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        ex.printStackTrace();
    }
}