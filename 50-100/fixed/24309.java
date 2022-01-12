public synchronized void fillUp(int foodQuantity) {
    int total = (getFoodQuantityAvailable()) + foodQuantity;
    int excess = total - (getMaxFoodQuantity());
    this.foodQuantityAvailable = total;
    if (excess > 0) {
        this.foodQuantityAvailable -= excess;
        throw new ie.macellone.ocpjp7.threads.basics.BowlOverflowException(("Bowl overflew " + excess));
    }
}