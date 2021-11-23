public void waitForMyTurn(final java.lang.String playerName) throws java.lang.InterruptedException {
    final fourinarowbot.domain.MarkerColor playerColor = getPlayerColor(playerName);
    while (true) {
        if ((playerColor.equals(MarkerColor.RED)) && (isRedPlayerTurn.get())) {
            break;
        }else
            if ((playerColor.equals(MarkerColor.YELLOW)) && (!(isRedPlayerTurn.get()))) {
                break;
            }
        
        java.lang.Thread.sleep(100);
    } 
}