public static java.lang.String getCharAfterOffset(java.lang.CharSequence text, int offset) {
    if (((text.length()) < (offset + 2)) || (offset == 0))
        return "";
    
    if (offset > 0) {
        return text.subSequence((offset + 1), (offset + 2)).toString();
    }
    return "";
}