public boolean settleResult(boolean win) {
    if (win) {
        currentBalance += 2 * (bet);
        return true;
    }else {
        currentBalance -= bet;
        return false;
    }
}