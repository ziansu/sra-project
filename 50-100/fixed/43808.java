public void sendOutputEvent(com.fbessou.sofa.OutputEvent event, int gamepadId) {
    if ((mGameIO) == null)
        return ;
    
    if ((gamepadId != (-1)) && (!(isGamePadConnected(gamepadId)))) {
        return ;
    }
    mGameIO.sendOutputEvent(event, gamepadId);
}