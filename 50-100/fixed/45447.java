private java.lang.String calc(java.lang.String input) {
    int length = input.length();
    java.lang.String modstring = "";
    for (int i = 0; i < length; i++) {
        char var = input.charAt(i);
        int value = ((int) (var)) + 1;
        var = ((char) (value));
        modstring = modstring + var;
    }
    return modstring;
}