public static java.lang.String getCharBeforeOffset(java.lang.CharSequence str, int offset) {
    if (((str.length()) == 0) || (offset == 0))
        return "";
    
    if (offset > 0) {
        return str.subSequence((offset - 1), offset).toString();
    }
    return "";
}