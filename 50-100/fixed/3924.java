public void setValue(java.math.BigInteger bigValue) {
    if (((bigValue.compareTo(KEdges.MAX_LONG)) <= 0) && ((bigValue.compareTo(KEdges.MIN_LONG)) > 0)) {
        setInteger(bigValue.longValue());
    }else {
        profile = KProfile.BIG_INTEGER;
    }
    this.bigNumerator = bigValue;
    this.bigDenominator = java.math.BigInteger.ONE;
}