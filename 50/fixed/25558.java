public int calculateRentalTotalPrice() {
    if ((!(validateQuantity(quantity))) || ((rentalType) == null)) {
        throw new java.lang.IllegalArgumentException("Please set quantity and rental type");
    }
    return (quantity) * (rentalType.getPrice());
}