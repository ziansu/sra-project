public Card deal() {
    if ((size) == 0) {
        return null;
    }
    (size)--;
    Card c = cards.get(size);
    return c;
}