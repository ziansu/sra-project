public java.util.List<com.dmens.pokeno.card.Card> getSelectedCards() {
    if ((panel.getComponentCount()) == 0)
        return pickedCards;
    
    while (((pickedCards.size()) < (amountOfCardsToPick)) || ((panel.getComponentCount()) != 0));
    dispose();
    return pickedCards;
}