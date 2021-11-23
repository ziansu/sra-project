@java.lang.Override
public java.util.List<klondike.model.Card> getCards(int numberOfCards) {
    assert numberOfCards <= (super.getVisibleCards());
    return super.getCards(numberOfCards);
}