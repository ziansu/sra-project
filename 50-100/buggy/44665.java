public void dealersTurn() {
    if (!(playerBusted))
        while ((dealerHand.getTotal(true)) <= 16)
            dealerHand.add(aDeck.getRandomCard());
        
    
    if ((dealerHand.getTotal(true)) > 21)
        dealerBusted = true;
    
    dealerTotal = dealerHand.getTotal(true);
}