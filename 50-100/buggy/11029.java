private void removePlayer(model.Address playerAddress) {
    theMaze.removePlayer(playerAddress.getKey());
    playersInGame.remove(playerAddress);
    try {
        tracker.deleteNode(playerAddress);
        tracker.updateNodesList(playersInGame);
    } catch (java.rmi.RemoteException e) {
        e.printStackTrace();
        java.lang.System.out.println("Tracker has stopped working");
        java.lang.System.exit(0);
    }
    if (backUpServer.sameAs(playerAddress)) {
        backUpServer = playersInGame.get(1);
    }
    updateBackUpServer();
    gameWindow.updateGame(theMaze);
}