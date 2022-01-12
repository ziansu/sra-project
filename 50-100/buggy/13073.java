public static double roundedToSize(double value, int sigFigs) {
    java.math.BigDecimal valueBDtoSize = java.math.BigDecimal.ZERO;
    if (java.lang.Double.isFinite(value)) {
        java.math.BigDecimal valueBD = new java.math.BigDecimal(value);
        int newScale = sigFigs - ((valueBD.precision()) - (valueBD.scale()));
        valueBDtoSize = valueBD.setScale(newScale, java.math.RoundingMode.HALF_UP);
    }
    return valueBDtoSize.doubleValue();
}