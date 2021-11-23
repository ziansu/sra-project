public java.util.Stack<klondike.entities.Card> getWaste() {
    waste = new java.util.Stack<klondike.entities.Card>();
    klondike.entities.Card card = new klondike.entities.Card();
    card.turnOver();
    waste.add(card);
    return waste;
}