public double drink(double toDrink) {
    this.amount = (amount) - toDrink;
    this.amount = ((amount) < 0) ? 0 : amount;
    return 0;
}