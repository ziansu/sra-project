public void setValue(java.math.BigInteger bigValue) {
    this.bigNumerator = bigValue;
    this.bigDenominator = java.math.BigInteger.ONE;
    if (((bigValue.compareTo(KEdges.MAX_LONG)) <= 0) && ((bigValue.compareTo(KEdges.MIN_LONG)) > 0)) {
        setInteger(bigValue.longValue());
    }else {
        profile = KProfile.BIG_INTEGER;
    }
}