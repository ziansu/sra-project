public int removeZero(java.lang.String number) {
    if ((number.charAt(0)) == '0') {
        return java.lang.Character.getNumericValue(number.charAt(1));
    }
    return java.lang.Integer.parseInt(number);
}