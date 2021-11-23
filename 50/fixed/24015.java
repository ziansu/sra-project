public static char[] processString(java.lang.String input) {
    char[] out = new char[1];
    input.getChars(0, input.length(), out, 0);
    return out;
}