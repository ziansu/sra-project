public boolean isValidMove(FourRowSolitaire.Card card) {
    return (card.getSuit().equals(suit)) && (((card.getNumber()) == ((peek().getNumber()) + 1)) || (isEmpty()));
}