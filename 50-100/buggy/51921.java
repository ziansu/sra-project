private java.lang.String calc(java.lang.String input) {
    java.lang.String output = "";
    for (int i = (input.length()) - 1; i >= 0; i++) {
        output = (input.charAt(i)) + output;
    }
    return output;
}