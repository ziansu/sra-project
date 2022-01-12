private java.lang.String calc(java.lang.String input) {
    int length = input.length();
    java.lang.StringBuilder reverse1 = new java.lang.StringBuilder();
    while (length > 0) {
        reverse1.append(input.charAt((length - 1)));
        length -= 1;
    } 
    return reverse1.toString();
}