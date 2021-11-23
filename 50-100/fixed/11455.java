private void LeaveGameMouseClicked(java.awt.event.MouseEvent evt) {
    comm.msgSender(("E" + ((char) ((Pexeso_client.CurrentGame.getID()) + '0'))));
    Pexeso_client.CurrentGame = null;
    comm.setExit(true);
    LobbyStatus.setText("You left your current game");
    LobbyStatus.setVisible(true);
    panel2.setVisible(true);
    panel3.setVisible(false);
}