public void playCard(com.dyllongagnier.triad.card.UndeployedCard card, int row, int col) {
    if ((this.nextTurn) != null)
        throw new java.lang.IllegalArgumentException("This turn is already complete and can not be changed.");
    
    if (this.moveValidator.apply(this.currentTurn, card, this.currentPlayer, row, col))
        throw new java.lang.IllegalArgumentException();
    
    this.nextTurn = this.currentTurn.playCard(this.currentPlayer, card, row, col);
}