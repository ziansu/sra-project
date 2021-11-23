public cards.Card removeCard(cards.Card toRemove) {
    cards.Card[] newDeck = new cards.Card[(deck.length) - 1];
    if (toRemove != null) {
        int i = 0;
        for (cards.Card c : deck) {
            if ((c.toString().compareTo(toRemove.toString())) != (-1)) {
                newDeck[i] = c;
                i++;
            }
        }
        deck = newDeck;
        return toRemove;
    }else
        return null;
    
}