public void refreshGamePageWithCheckForAction() {
    if ((getAction()) != null) {
        sendShowActionToPlayer();
        sendGameMessageToOpponent("refresh_game_page");
    }else {
        if (!(getPlayer().isYourTurn())) {
            sendGameMessageToOpponent("refresh_game_page");
        }else {
            sendGameMessageToAll("refresh_game_page");
        }
    }
}