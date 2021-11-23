public boolean withdraw(float amount) {
    if (((getState()) == (State.OPEN)) && (amount > 0.0F)) {
        balance = (balance) - amount;
        (numWithdraws)++;
        if ((numWithdraws) > 3)
            balance = (balance) - 1.0F;
        
        if ((balance) <= 0.0F) {
            setState(State.OVERDRAWN);
        }
        return true;
    }
    return false;
}