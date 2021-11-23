public static boolean isEOL(int ch) {
    if ((((char) (ch)) == '\n') || (((char) (ch)) == '\r'))
        return true;
    else
        return false;
    
}