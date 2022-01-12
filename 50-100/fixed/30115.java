@java.lang.Override
public scum.Card deal() throws scum.ScumException {
    if ((deck.size()) == 0)
        throw new scum.ScumException("Deck is empty.");
    
    java.util.Random rand = new java.util.Random();
    int randomNum = rand.nextInt(deck.size());
    return deck.remove(randomNum);
}