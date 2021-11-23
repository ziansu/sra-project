public java.lang.String determineOutcome(int playerCardValue, int dealerCardValue) {
    if (playerCardValue > dealerCardValue) {
        return "win";
    }else
        if (playerCardValue < dealerCardValue) {
            return "lose";
        }else
            return "tie";
        
    
}