public void addCardToBottom(Card cardIn) {
    for (int i = (deckTopPointer) - 1; i == 0; i--)
        mainDeck[(i + 1)] = mainDeck[i];
    
    mainDeck[0] = cardIn;
    (deckTopPointer)++;
}