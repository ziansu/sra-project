@java.lang.Override
public void remove(int numberOfCards) {
    if (((super.getVisibleCards()) - numberOfCards) > (klondike.model.Waste.MIN_VISIBLE_CARDS)) {
        super.setVisibleCards(((super.getVisibleCards()) - numberOfCards));
    }else {
        super.setVisibleCards(klondike.model.Waste.MIN_VISIBLE_CARDS);
    }
    super.remove(numberOfCards);
}