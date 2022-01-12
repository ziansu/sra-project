public void setIsAboveLine(java.math.BigDecimal x, java.math.BigDecimal y) {
    java.math.BigDecimal xProduct = deltaX.multiply(x);
    java.math.BigDecimal yProduct = deltaY.multiply(y);
    java.math.BigDecimal result = yProduct.subtract(xProduct).subtract(constant);
    isAboveLine = (result.compareTo(new java.math.BigDecimal(0))) > 0;
}