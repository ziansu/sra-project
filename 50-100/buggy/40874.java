public int search(funwithcards.Card card) {
    for (int i = 0; i < (cardsInDeck.size()); i++) {
        funwithcards.Card candidate = cardsInDeck.get(i);
        if (card == candidate) {
            java.lang.System.out.println(candidate.getCardType());
            java.lang.System.out.println(candidate.getSuite());
            return i;
        }
    }
    return -1;
}