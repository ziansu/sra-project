public boolean canBeStackedOnto(klondike.Klondike.Card other) {
    if (other == null)
        return (number) == (klondike.Klondike.CARDS_PER_SUIT);
    
    return ((number) == ((other.number) - 1)) && ((((suit) + (other.suit)) % 2) == 1);
}