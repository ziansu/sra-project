public java.util.List<com.dmens.pokeno.card.Card> getSelectedCards() {
    if ((panel.getComponentCount()) == 0) {
        dispose();
        return pickedCards;
    }
    java.lang.System.out.println(pickedCards.size());
    while (((pickedCards.size()) < (amountOfCardsToPick)) && ((panel.getComponentCount()) != 0));
    dispose();
    return pickedCards;
}