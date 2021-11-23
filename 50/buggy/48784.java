public int getStock() {
    if ((quantity) > 0) {
        this.quantity = --(quantity);
    }
    return this.quantity;
}