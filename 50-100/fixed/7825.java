public void shuffleDeck() {
    int random = 0;
    for (int i = 0; i < (numberOfCards); i++) {
        random = srk.syracuse.gameofcards.Model.Deck.getRandomCard(i);
        srk.syracuse.gameofcards.Model.Cards temp = cards[i];
        cards[i] = cards[random];
        cards[random] = temp;
    }
}