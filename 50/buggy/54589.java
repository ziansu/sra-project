public static final int getNumberValue(java.lang.String number) {
    if ((number.equals(jaddon.math.JNumber.DOT)) || (number.equals(jaddon.math.JNumber.COMMA))) {
        return -1;
    }
    return NumberSystem.NUMBERSADVANCED.indexOf(number);
}