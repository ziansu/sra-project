@java.lang.Override
public boolean addCard(be.ac.ulg.montefiore.oop.cards.Card card) {
    card.placeOn(this.getTopCard());
    this.setTopCard(card);
    this.increaseNumCards();
    this.board.getHandler().getGUI().stockEmpty(this.isEmpty());
    this.board.getHandler().getGUI().refreshWindow();
    return true;
}