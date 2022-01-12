public void exeDRAW() {
    if (eplayer.deck.curCards.isEmpty()) {
        eplayer.life = 0;
        hasWon = true;
        gameOver = true;
        inGameState = GAME_OVER_STATE;
    }else {
        ehand.add(eplayer.deck.curCards.removeFirst());
    }
}