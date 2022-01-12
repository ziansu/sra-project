public void hit(java.util.ArrayList<models.Card> deck) {
    addHand(deck.get(((deck.size()) - 1)));
    deck.remove(((deck.size()) - 1));
    if ((TotalScore()) > 21)
        stay();
    
}