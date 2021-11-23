public void move(int columnFrom, int columnTo) {
    if (columnHasCards(columnFrom)) {
        addCardToCol(columnTo, this.getTopCard(columnFrom));
        removeCardFromCol(columnFrom);
    }else {
        system.out.print("There is no card to move in that column.");
    }
}