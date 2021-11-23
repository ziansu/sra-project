@java.lang.Override
public void onIncomingEvent(int clientId, java.lang.String event, java.lang.String[] params) {
    if (event.equals("resultUI_Start")) {
        gc.sendGameEvent(gc.getCurrentGameEngine().getClientStart());
        gameManager.initPlayerstoUI(teams);
    }else
        if (event.equals("result_ready")) {
            showResultScore();
            (cntPlayer)++;
        }else
            if (event.equals("playerConfirm")) {
                playerConfirm(clientId);
                (cntPlayer)++;
                onPlayerReady(playerAmount);
            }
        
    
}