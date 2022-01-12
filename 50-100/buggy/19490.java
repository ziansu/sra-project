private void moveCardsInColumn(int index) {
    Column column = board.getColumns().get(index);
    if ((index == 0) && (globalWipLimitReached(index))) {
        return ;
    }
    java.util.List<Card> cardsToBeRemoved = new java.util.ArrayList<Card>();
    for (Card card : column.getCards()) {
        moveCardForward(index, column, cardsToBeRemoved, card);
    }
    column.getCards().removeAll(cardsToBeRemoved);
}