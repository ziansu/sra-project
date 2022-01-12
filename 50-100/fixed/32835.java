public static int getConvertedAsciiValue(java.lang.String digits, short baseNumber) {
    java.util.List<java.lang.Integer> convertIntegerToDigits = com.sample.util.Util.splitIntegerToSingleDigits(digits);
    java.lang.Integer asciiValue = 0;
    for (int i = 0; i < (convertIntegerToDigits.size()); i++) {
        asciiValue += (convertIntegerToDigits.get(i)) * (com.sample.util.Util.pow(baseNumber, ((convertIntegerToDigits.size()) - (i + 1))));
    }
    return asciiValue;
}