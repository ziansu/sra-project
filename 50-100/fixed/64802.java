public boolean isValidMove(FourRowSolitaire.Card card) {
    return (card.getSuit().equals(suit)) && ((isEmpty()) || ((card.getNumber()) == ((peek().getNumber()) + 1)));
}