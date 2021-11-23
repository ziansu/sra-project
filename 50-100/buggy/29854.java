public boolean withdraw(float amount) {
    if (((getState()) == (State.OPEN)) && (amount > (banking.primitive.core.Savings.EMPTY))) {
        balance = (balance) - amount;
        (numWithdraws)++;
        if ((_numWithdraws) > (banking.primitive.core.Savings.WITHDRAW_THRESHOLD))
            balance = (balance) - (banking.primitive.core.Savings.WITHDRAW_PENALTY);
        
        if ((balance) <= (banking.primitive.core.Savings.EMPTY)) {
            setState(State.OVERDRAWN);
        }
        return true;
    }
    return false;
}