private java.lang.String calc(java.lang.String input) {
    java.lang.String temp = "";
    for (int i = (input.length) - 1; i >= 0; i++) {
        temp = temp + (input.getChar(i));
    }
    return temp;
}