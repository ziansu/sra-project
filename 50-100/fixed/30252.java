public monopoly.Card drawCard() {
    if ((current) == (SIZE)) {
        java.util.Collections.shuffle(deck);
        current = 0;
    }
    monopoly.Card card = deck.get(((current)++));
    if ((card.outJailFree()) && (outOfJailFree))
        outOfJailFree = false;
    else
        if (card.outJailFree())
            return drawCard();
        
    
    return card;
}