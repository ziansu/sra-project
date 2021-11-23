private void playerHits(cardgames.blackjack.Player p) {
    p.getHand().addCard(dealCard());
    int newHandValue = p.getHand().value();
    if (newHandValue > 21)
        p.setStatus(Status.BUST);
    else
        if (newHandValue == 21)
            p.setStatus(Status.TWENTYONE);
        
    
}