public int findTokenStart(java.lang.CharSequence text, int cursor) {
    int i = cursor;
    while ((i > 0) && (!(splitChar.contains(text.charAt((i - 1)))))) {
        i--;
    } 
    if ((i > 0) && ((text.charAt(i)) == ' ')) {
        i++;
    }
    return i;
}