public boolean playerWin(fr.esiea.chhuondaniere.player.Player currentPlayer) {
    if ((currentPlayer.getwordlist().size()) > 1) {
        return true;
    }else {
        return false;
    }
}