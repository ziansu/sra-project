protected java.math.BigDecimal generateNextPrice(java.math.BigDecimal price) {
    return bdc.stringToBD(bdc.format(price.multiply(java.math.BigDecimal.valueOf(1.5))));
}