private static java.lang.String reverseString(java.lang.String string) {
    java.lang.String reverse = new java.lang.String();
    for (int i = (string.length()) - 1; i >= 0; i--) {
        reverse += string.charAt(i);
    }
    return reverse;
}