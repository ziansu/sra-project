private java.lang.String calc(java.lang.String input) {
    java.lang.String newStr = "";
    for (int i = 1; i < (input.length()); i++) {
        newStr += input.charAt(((input.length()) - i));
    }
    return newStr;
}