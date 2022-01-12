public game.Card revealCard(game.CardType type) throws java.lang.Exception {
    game.Card revealed = null;
    for (int i = 0; i < 2; i++) {
        if (((hand[i].influence) == type) && (!(hand[i].revealed()))) {
            hand[i].reveal();
            revealed = hand[i];
        }
    }
    if (revealed == null) {
        throw new java.lang.Exception("Couldn't find card to reveal!");
    }
    return revealed;
}