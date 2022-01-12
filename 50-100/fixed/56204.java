public boolean isPendingIncludePartialWaivers() {
    if ((!((isPaid()) || (isWaived()))) || ((isWaived()) && (!(this.amount.equals(this.amountWaived))))) {
        return true;
    }
    return false;
}