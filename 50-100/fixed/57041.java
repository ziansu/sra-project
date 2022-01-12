private static void checkStringIsValidBinNumber(java.lang.String bin) {
    char firstDigit = bin.charAt(0);
    if (((firstDigit != (org.hetc.binaryNumber.BinaryNumber.ZERO_DIGIT)) && (firstDigit != (org.hetc.binaryNumber.BinaryNumber.ONE_DIGIT))) && (firstDigit != (org.hetc.binaryNumber.BinaryNumber.MINUS))) {
        throw new java.lang.NumberFormatException(("Invalid charackter for the first digit of the String" + " - must be 0, 1 or '-'"));
    }
}