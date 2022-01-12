public void fillDecks() {
    mainDeck.shuffle();
    for (int i = 0; i < 26; i++) {
        playerDeck.add(mainDeck.getCard(i));
    }
    for (int i = 26; i < 52; i++) {
        dealerDeck.add(mainDeck.getCard(i));
    }
}