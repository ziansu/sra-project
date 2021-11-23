@java.lang.Override
public void playerReady(int playerID) throws java.rmi.RemoteException {
    playersHashMap.get(playerID).playerReady = true;
    (playersReadyCounter)++;
    if (((playersReadyCounter) >= (GameRegistration.MIN_START_PLAYERS)) && ((playersReadyCounter) == (playersCounter)))
        gameStart();
    else {
        if ((playersReadyCounter) >= (GameRegistration.MIN_START_PLAYERS))
            setGameStartTimer(GameRegistration.START_GAME_TIMEOUT);
        
        java.lang.System.out.println((("Player " + playerID) + "waiting..."));
        waitGameStart();
    }
}