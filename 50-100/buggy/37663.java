public UnoCard drawCard() {
    if (this.deck.isEmpty()) {
        java.util.Iterator<UnoCard> i = this.discard.iterator();
        while (i.hasNext()) {
            UnoCard uc = i.next();
            this.deck.regularInsert(uc);
        } 
        this.discard.clear();
    }
    return this.deck.removeAt(0);
}