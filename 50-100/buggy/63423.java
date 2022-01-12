static java.util.ArrayList<deckofcards.Card> isLowPair(videopoker.Hand hand) {
    java.util.ArrayList<deckofcards.Card> tohold = videopoker.JacksOrBetter.isThereAPair(hand);
    if (tohold != null)
        if ((tohold.get(0).getScore()) < 10)
            return tohold;
        
    
    return null;
}