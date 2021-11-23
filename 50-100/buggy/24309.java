public synchronized void fillUp(int foodQuantity) {
    int total = (getFoodQuantityAvailable()) + foodQuantity;
    int excess = total - (getMaxFoodQuantity());
    this.foodQuantityAvailable = total - excess;
    if (excess > 0) {
        throw new ie.macellone.ocpjp7.threads.basics.BowlOverflowException(("Bowl overflew " + excess));
    }
}