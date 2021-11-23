public void init(org.magic.api.beans.MagicDeck deck) {
    cards = new java.util.ArrayList<org.magic.api.beans.MagicCard>();
    for (java.util.Map.Entry<org.magic.api.beans.MagicCard, java.lang.Integer> cci : deck.getMap().entrySet()) {
        org.magic.api.beans.MagicCard mc = cci.getKey();
        for (int i = 0; i < (cci.getValue()); i++)
            cards.add(mc);
        
    }
    refresh();
}