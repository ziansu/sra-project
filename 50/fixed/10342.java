public void takeBet(int bet) {
    if (bet < 0)
        throw new java.lang.IllegalArgumentException("Bet cannot be negative.");
    
    if (!(balanceExceedsLimitBy(bet)))
        throw new java.lang.IllegalArgumentException("Placing bet would go below limit.");
    
    balance = (balance) - bet;
}