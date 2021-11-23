public boolean deposit(float amount) {
    if (((getState()) != (State.CLOSED)) && (amount > (banking.primitive.core.Savings.EMPTY))) {
        balance = ((balance) + amount) - (banking.primitive.core.Savings.DEPOSIT_FEE);
        if ((balance) >= (banking.primitive.core.Savings.EMPTY)) {
            setState(State.OPEN);
        }
    }
    return false;
}