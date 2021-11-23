public boolean incrementWithdrawals() {
    (withdrawals)++;
    if ((withdrawals) <= (MoneyMarket.WITHDRAW_LIMIT))
        return true;
    
    (withdrawals)--;
    return false;
}