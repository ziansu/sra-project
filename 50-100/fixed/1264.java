public static java.lang.String getCharAfterOffset(java.lang.CharSequence str, int offset) {
    if (((str.length()) < (offset + 2)) || (offset == 0))
        return "";
    
    if (offset > 0) {
        return str.subSequence((offset + 1), (offset + 2)).toString();
    }
    return "";
}