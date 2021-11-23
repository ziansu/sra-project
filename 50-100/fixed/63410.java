public void sendCustomMessage(java.lang.String customMessage, int gamepadId) {
    if ((mGameIO) == null)
        return ;
    
    if ((gamepadId != (-1)) && (!(isGamePadConnected(gamepadId)))) {
        return ;
    }
    com.fbessou.sofa.message.GameCustomMessage msg = new com.fbessou.sofa.message.GameCustomMessage(customMessage, gamepadId);
    mGameIO.sendMessage(msg);
}