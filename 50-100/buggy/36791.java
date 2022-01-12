public void regenerateQR(java.net.ServerSocket socket, chiefinvigilator.ServerComm serverComm, java.lang.String randomString) throws java.lang.Exception {
    this.serverComm = serverComm;
    this.socket = socket;
    this.randomString = randomString;
    try {
        this.qrCode = ((("$CHIEF:" + (localIp(socket.getLocalPort()))) + ":") + randomString) + ":$";
    } catch (java.lang.Exception ex) {
        java.util.logging.Logger.getLogger(qrgen.QRgen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    repaint();
}