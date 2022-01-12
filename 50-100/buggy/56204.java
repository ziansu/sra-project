public boolean isPendingIncludePartialWaivers() {
    if ((!((isPaid()) || (isWaived()))) || ((isWaived()) && ((this.amount) != (this.amountWaived)))) {
        return true;
    }
    return false;
}