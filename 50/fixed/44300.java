public void gas(double amount) {
    if ((amount > 1.0) || (amount < 0)) {
        amount = 0;
    }
    incrementSpeed(amount);
}