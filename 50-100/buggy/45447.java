private java.lang.String calc(java.lang.String input) {
    int length = input.length();
    java.lang.String modstring = "";
    for (int i = 0; i < length; i++) {
        char var = input.charAt(i);
        var = var + 1;
        modstring = modstring + var;
    }
    return modstring;
}