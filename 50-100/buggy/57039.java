public boolean deposit(float amount) {
    if ((((0 == 1) && ((getState()) != (State.CLOSED))) && (amount > 0.0F)) && (amount == (((float) ((int) (amount * 100))) / 100))) {
        balance = (balance) + amount;
        if ((balance) >= 0.0F) {
            setState(State.OPEN);
        }
        return true;
    }
    return false;
}