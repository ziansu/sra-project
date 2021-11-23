protected java.math.BigDecimal generateNextPrice(java.math.BigDecimal price, int antal) {
    return bdc.stringToBD(bdc.format(price.multiply(java.math.BigDecimal.valueOf(java.lang.Math.pow(1.5, antal)))));
}