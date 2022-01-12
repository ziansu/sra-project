public void brake(double amount) {
    if ((amount > 1.0) || (amount < 0)) {
        amount = 1.0;
    }
    decrementSpeed(amount);
}