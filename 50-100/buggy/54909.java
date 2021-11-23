private void onClientFinishedMessage(tuc.werkstatt.doubleup.Network.ClientFinishedMessage msg) {
    if (((msg.gameID) != (currMiniGameID)) || (miniGameAlreadyFinished)) {
        return ;
    }
    miniGameAlreadyFinished = true;
    Gdx.app.log("Server", ("ClientFinishedMessage received from client " + (msg.clientID)));
    sendGameFinishedMessage(msg.clientID);
    givePointsToPlayers(msg.clientID);
    if ((currMiniGameRound) < (GameOptions.maxMiniGameRounds)) {
        sendProgressMessage();
    }
}