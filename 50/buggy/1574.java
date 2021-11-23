private static boolean isChar(byte b) {
    if (((b < 'A') || ((b > 'Z') && (b < 'a'))) || (b > 'z'))
        return false;
    else
        return true;
    
}