public Card deal() {
    (size)--;
    if ((size) == 0) {
        return null;
    }
    Card c = cards.get(size);
    return c;
}