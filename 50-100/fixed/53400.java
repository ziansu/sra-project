protected java.lang.String longToString(long input) {
    java.lang.String output = "";
    for (int i = (length) - 1; i >= 0; i--) {
        output = (maps[i].charAt((((int) (input)) % (bases[i])))) + output;
        input /= bases[i];
    }
    return output;
}