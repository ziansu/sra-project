public boolean compareToExpectedLevel(java.math.BigDecimal level) {
    int expectedLevel = mExpectedLevel.multiply(new java.math.BigDecimal(100)).intValue();
    int levelConverted = level.multiply(new java.math.BigDecimal(100)).intValue();
    if (levelConverted < expectedLevel) {
        return true;
    }else {
        return false;
    }
}