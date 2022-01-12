public java.lang.String getAgeLabel(double age, boolean isInteger) {
    if (!(isStdChron)) {
        if (((unit) != null) && (unit.isNegated())) {
            age = -age;
        }
        return java.lang.Double.toString(new java.math.BigDecimal(age).setScale(2, java.math.BigDecimal.ROUND_HALF_UP).doubleValue());
    }
    return java.lang.Double.toString(new java.math.BigDecimal(age).setScale(2, java.math.BigDecimal.ROUND_HALF_UP).doubleValue());
}