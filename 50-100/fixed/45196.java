public void waitForMyTurn(final java.lang.String playerName) throws java.lang.InterruptedException {
    final fourinarowbot.domain.MarkerColor playerColor = getPlayerColor(playerName);
    while (true) {
        synchronized(isRedPlayerTurn) {
            if ((playerColor.equals(MarkerColor.RED)) && (isRedPlayerTurn)) {
                break;
            }else
                if ((playerColor.equals(MarkerColor.YELLOW)) && (!(isRedPlayerTurn))) {
                    break;
                }
            
        }
        java.lang.Thread.sleep(100);
    } 
}