public void changedName(javafx.event.ActionEvent evt) {
    try {
        currentLobby.setGameName(textGameName.getText());
    } catch (java.rmi.RemoteException ex) {
        java.util.logging.Logger.getLogger(GUI.LobbyController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}