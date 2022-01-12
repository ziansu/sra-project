public static int chars2digits(java.lang.String num) {
    int result = 0;
    for (int i = 0; i < (num.length()); i++) {
        result = ((result * (ua.nure.shevchenko.Practice1.Part5.ALPHABET_LENGTH)) + ((int) (num.charAt(i)))) - (ua.nure.shevchenko.Practice1.Part5.ALPHABET_START);
    }
    return result;
}