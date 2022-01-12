private java.lang.String calc(java.lang.String input) {
    java.lang.StringBuilder str = new java.lang.StringBuilder(input);
    str.append(input.substring(0, 2));
    str.deleteCharAt(0);
    str.deleteCharAt(0);
    return str.toString();
}