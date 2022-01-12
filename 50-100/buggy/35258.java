private java.lang.String calc(java.lang.String input) {
    result = "";
    for (int i = 2; i < (input.length()); i++) {
        result = (result) + (charAt(i));
    }
    result = ((result) + (charAt(0))) + (charAt(1));
    return result;
}