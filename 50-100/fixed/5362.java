public long calcPriceWithDiscount() {
    if ((quantity) == 0) {
        return 0;
    }
    if ((discounts.getTotal()) == 0) {
        return price;
    }
    long price1 = java.lang.Math.abs(((long) (((getTotal()) * 1000.0) / (quantity))));
    return price1;
}