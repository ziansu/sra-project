private double roundDouble(double v) {
    java.math.BigDecimal vb = new java.math.BigDecimal(v);
    java.math.BigDecimal right = new java.math.BigDecimal(100.0);
    return (java.lang.Math.round(vb.multiply(right).doubleValue())) / 100.0;
}