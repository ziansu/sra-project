public void setQuantity(int quantity) {
    if ((rentalType) == null) {
        throw new java.lang.IllegalArgumentException("Please set rental type");
    }
    if (!(validateQuantity(quantity))) {
        throw new java.lang.IllegalArgumentException(("The quantity must be between 1 and " + (java.lang.String.valueOf(rentalType.getMax()))));
    }
    this.quantity = quantity;
}