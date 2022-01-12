private java.lang.String calc(java.lang.String input) {
    int x = input.length;
    for (int i = 0; i < x; i++) {
        input.setCharAt(i, ((charAt(i)) + 1));
    }
    return null;
}