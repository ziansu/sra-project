private long switchToNewCard(com.seniordesign.wolfpack.quizinator.Database.Deck.Deck deck, int deckIndex) {
    cardTimerRunning.cancel();
    if ((deckLength) > deckIndex) {
        ((android.widget.TextView) (findViewById(R.id.scoreText))).setText(("Score: " + (score)));
        currentCard = deck.getCards().get(deckIndex);
        showCard(currentCard);
        cardTimerRunning = cardTimerStatic.start();
        (this.deckIndex)++;
    }else {
        endGamePlay();
    }
    return currentCard.getId();
}