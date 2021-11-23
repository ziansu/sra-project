public static boolean isValidBet(java.lang.String bet, int maxBet) {
    if (bet.matches("([0-9])+")) {
        int amount = java.lang.Integer.parseInt(bet);
        if ((amount <= maxBet) && (amount >= (utilities.Validator.MIN_BET)))
            return true;
        
    }
    return false;
}