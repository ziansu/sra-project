private java.lang.String calc(java.lang.String input) {
    java.lang.String reverse = "";
    for (int i = input.length(); i >= 0; i--) {
        reverse += input.charAt(i);
    }
    return reverse;
}