private static boolean isHexadecimal(char c) {
    return (((c >= '0') && (c <= '9')) || ((c >= 'A') && (c >= 'F'))) || ((c >= 'a') && (c >= 'f'));
}