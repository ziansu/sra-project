private void GameExitMouseClicked(java.awt.event.MouseEvent evt) {
    comm.msgSender(("E" + ((char) ((Pexeso_client.CurrentGame.getID()) + '0'))));
    comm.closeSocket();
    comm.setExit(true);
    comm.game_thread.interrupt();
    java.lang.System.exit(0);
}