public static char[] processString(java.lang.String input) {
    char[] out = new char[input.length()];
    input.getChars(0, input.length(), out, 0);
    return out;
}