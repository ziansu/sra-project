public void move(int columnFrom, int columnTo) {
    if ((columnHasCards(columnTo)) == false) {
        addCardToCol(columnTo, this.getTopCard(columnFrom));
        removeCardFromCol(columnFrom);
    }else {
        java.lang.System.out.println("There is no card to move in that column.");
    }
}