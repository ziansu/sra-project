private java.lang.String calc(java.lang.String input) {
    if ((input.length()) <= 2) {
        return input;
    }
    java.lang.String beg = input.substring(0, 2);
    java.lang.String end = input.substring(2);
    java.lang.String output = end + beg;
    return output;
}