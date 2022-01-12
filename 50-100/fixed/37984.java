protected long stringToLong(java.lang.String input) {
    long output = 0;
    for (int i = 0; i < (length); i++) {
        output = (output * (bases[i])) + (maps[i].indexOf(input.charAt(i)));
    }
    return output;
}