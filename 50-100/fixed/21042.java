java.lang.String generateSeqStartingFromNum(final java.lang.String number, final java.lang.Integer minLength) {
    java.lang.StringBuilder result = new java.lang.StringBuilder();
    java.math.BigInteger biNumber = new java.math.BigInteger(number);
    while ((result.length()) <= minLength) {
        result.append(biNumber);
        biNumber = getNextNumForSequence(biNumber);
    } 
    result.append(biNumber);
    return result.toString();
}