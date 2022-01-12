public byte withdraw(double amount) {
    if (amount <= (balance)) {
        balance -= amount;
        return 0;
    }else {
        return 1;
    }
}