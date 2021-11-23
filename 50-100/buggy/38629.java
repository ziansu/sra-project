@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    model.getGamePlayerList().deleteFromGame(model.getNickname(), model.getCurrentHostName());
    model.getMe().setAvailable(true);
    DistribullyController.lobbyThread.setInLobby(false);
    DistribullyController.waitForInviteThread = new distribully.controller.WaitForInviteThread(model);
    model.setGAME_STATE(GameState.NOT_PLAYING);
    new distribully.controller.ClientListUpdateHandler(model);
}