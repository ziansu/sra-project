public boolean nextPlayer() {
    if ((currentPlayerIndex) != ((players.size()) - 1)) {
        (currentPlayerIndex)++;
        turninfo.setText(getCurrentPlayer().toString());
        return true;
    }else {
        currentPlayerIndex = 0;
        turninfo.setText(getCurrentPlayer().toString());
        return false;
    }
}