public static java.lang.String getCharBeforeOffset(java.lang.CharSequence text, int offset) {
    if (((text.length()) == 0) || (offset == 0))
        return "";
    
    if (offset > 0) {
        return text.subSequence((offset - 1), offset).toString();
    }
    return "";
}