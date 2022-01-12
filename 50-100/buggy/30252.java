public monopoly.Card drawCard() {
    if ((current) == (SIZE)) {
        java.util.Collections.shuffle(deck);
        current = 0;
    }
    monopoly.Card card = deck.get(((current)++));
    if ((card.outJailFree()) && (outOfJailFree))
        outOfJailFree = false;
    else
        card = deck.get(((current)++));
    
    return card;
}