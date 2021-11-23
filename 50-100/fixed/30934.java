private static java.lang.String fillWithZeros(long number, int digits) {
    java.lang.String stringNumber = java.lang.String.valueOf(number);
    int numberLength = stringNumber.length();
    if ((stringNumber.length()) < digits) {
        for (int i = 0; i < (digits - numberLength); i++) {
            stringNumber = "0" + stringNumber;
        }
    }
    return stringNumber;
}