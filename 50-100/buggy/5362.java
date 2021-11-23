public long calcPriceWithDiscount() {
    if ((quantity) == 0) {
        return 0;
    }
    if ((discounts.getTotal()) == 0) {
        return price;
    }
    long price1 = java.lang.Math.abs(java.lang.Math.round((((getTotal()) * 1000.0) / (quantity))));
    if ((java.lang.Math.round(((price1 * (quantity)) / 1000.0))) > (getTotal())) {
        price1--;
    }
    return price1;
}