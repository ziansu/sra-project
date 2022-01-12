public void refreshGamePageWithCheckForAction() {
    if ((getAction()) != null) {
        sendShowActionToPlayer();
        sendGameMessageToOpponent("refresh_game_page");
    }else {
        if (!(getPlayer().isYourTurn())) {
            refreshAfterEndTurn();
        }else {
            sendGameMessageToAll("refresh_game_page");
        }
    }
}