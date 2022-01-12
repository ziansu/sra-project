private void fillDeck() {
    int typeSelection = 0;
    int suitSelection = 0;
    for (int i = 0; i < 52; i++) {
        if (((i % 13) == 0) && (i != 0)) {
            typeSelection = 0;
            suitSelection++;
        }
        cards.add(new com.trimteam.blackjack.Card(Card.CardSuit.values()[suitSelection], Card.CardType.values()[typeSelection]));
        typeSelection++;
    }
}