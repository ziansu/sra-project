protected static boolean isAllASCII(java.lang.String input) {
    boolean isASCII = true;
    for (int i = 0; i < (input.length()); i++) {
        int c = input.charAt(i);
        if (c > 127) {
            isASCII = false;
            break;
        }
    }
    return isASCII;
}