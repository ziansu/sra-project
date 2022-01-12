private java.lang.String calc(java.lang.String input) {
    java.lang.String ret = (("" + (input.charAt(((input.length()) - 1)))) + (input.subString(1, ((input.length()) - 1)))) + (input.charAt(0));
    return ret;
}