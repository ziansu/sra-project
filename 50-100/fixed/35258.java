private java.lang.String calc(java.lang.String input) {
    java.lang.String result = "";
    for (int i = 2; i < (input.length()); i++) {
        result = result + (input.charAt(i));
    }
    result = (result + (input.charAt(0))) + (input.charAt(1));
    return result;
}