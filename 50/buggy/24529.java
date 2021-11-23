private java.lang.String calc(java.lang.String input) {
    temp = "";
    for (int i = (input.length) - 1; i >= 0; i++) {
        temp += input.getChar(i);
    }
    return temp;
}