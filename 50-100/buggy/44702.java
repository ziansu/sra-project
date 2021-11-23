public boolean compareToExpectedLevel(java.math.BigDecimal level) {
    int expectedLevel = mExpectedLevel.multiply(new java.math.BigDecimal(100)).intValue();
    int levelConverted = level.multiply(new java.math.BigDecimal(100)).intValue();
    if (levelConverted < expectedLevel) {
        android.util.Log.d("tag", "Charge your phone!");
        return true;
    }else {
        android.util.Log.d("tag", "Don't charge your phone!");
        return false;
    }
}