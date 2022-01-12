private java.lang.String calc(java.lang.String input) {
    java.lang.String temp = "";
    for (int i = 0; i < (input.length()); i++) {
        temp = temp + ((char) ((input.charAt(i)) + 1));
    }
    return temp;
}