public static boolean isInteger(java.lang.String str) {
    int i = -1;
    while ((++i) < (str.length())) {
        char c = str.charAt(i);
        if ((c < '0') || (c > '9')) {
            return false;
        }
    } 
    return true;
}