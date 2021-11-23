public boolean withdraw(int amount) {
    amount = java.lang.Math.abs(amount);
    if ((this.balance) > amount) {
        this.balance -= amount;
        return true;
    }
    return false;
}