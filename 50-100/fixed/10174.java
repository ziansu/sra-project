private java.lang.String calc(java.lang.String input) {
    if (input == null) {
        return "";
    }
    java.lang.String word = "";
    for (int i = 0; i < (input.length()); i++) {
        word += (input.charAt(i)) + 1;
    }
    return word;
}