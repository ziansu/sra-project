public java.lang.String toString() {
    java.lang.String cardSymbols = "";
    java.lang.String values = "";
    for (int x = 0; x <= (lastCard); x++) {
        cardSymbols += (CardUtils.cardToString(cards[x])) + " ";
        values += (CardUtils.getValue(cards[x])) + " ";
    }
    return ((cardSymbols + "\n") + values) + "\n";
}