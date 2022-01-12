public boolean deposit(float amount) {
    if ((((getState()) != (State.CLOSED)) && (amount > 0.0F)) && ((balance) >= 0)) {
        balance = (balance) + amount;
        setState(State.OPEN);
        return true;
    }else {
        return false;
    }
}