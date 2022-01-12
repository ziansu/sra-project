public boolean set(char value, Card.Suit suit) {
    if (isValid(value, suit)) {
        this.value = value;
        this.suit = suit;
        return true;
    }
    return false;
}