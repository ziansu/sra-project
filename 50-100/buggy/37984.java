private long stringToLong(java.lang.String input) {
    long output;
    output = maps[0].indexOf(input.charAt(0));
    for (int i = 1; i < (length); i++) {
        output = (output * (bases[(i - 1)])) + (maps[i].indexOf(input.charAt(i)));
    }
    return output;
}