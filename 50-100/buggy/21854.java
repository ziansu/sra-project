private java.lang.String calc(java.lang.String input) {
    java.lang.String reverse = "";
    for (int i = (input.length()) - 1; i >= 0; i--) {
        reverse = reverse + (input.charAt(i));
        return reverse;
    }
}