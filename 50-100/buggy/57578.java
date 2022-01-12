public boolean nextPlayer() {
    java.lang.System.out.println("Next person's turn!");
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