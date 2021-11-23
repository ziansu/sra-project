public void Disconnect() {
    if (IsAuthorized) {
        HT.remove(Login);
        IsAuthorized = false;
        try {
            IsClientDisconnect = true;
            SendReplyToClient("DO");
            cs.close();
        } catch (java.io.IOException ex) {
            SendReplyToClient("DN");
            java.util.logging.Logger.getLogger(server.RecvThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}