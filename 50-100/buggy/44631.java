public static int chars2digits(java.lang.String number) {
    int result = 0;
    for (int i = 0; i < (number.length()); i++) {
        result = ((result * (ua.nure.shevchenko.Practice1.Part5.ALPHABET_LENGTH)) + ((int) (number.charAt(i)))) - (ua.nure.shevchenko.Practice1.Part5.ALPHABET_START);
    }
    return result;
}