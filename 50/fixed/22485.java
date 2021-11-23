private java.lang.String calc(java.lang.String input) {
    java.lang.String s = "";
    for (char c : input.toCharArray()) {
        s = s + (c + 1);
    }
    return s;
}