private java.lang.String calc(java.lang.String input) {
    java.lang.String reversed = "";
    for (int i = input.length; i > 0; i--) {
        reversed = reversed + (input.substring((i - 1), i));
    }
    return reversed;
}