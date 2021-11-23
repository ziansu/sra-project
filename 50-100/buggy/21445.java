public boolean deposit(float amount) {
    if (((getState()) != (State.CLOSED)) && (amount > 0.0F)) {
        balance = ((balance) + amount) - 0.5F;
        if ((balance) > 0.0F) {
            setState(State.OPEN);
        }
    }
    return false;
}