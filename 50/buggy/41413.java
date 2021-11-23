public boolean remove(int amount) {
    if (amount < (this.amount)) {
        this.amount -= amount;
        return true;
    }
    return false;
}