public static java.lang.String right(java.lang.String s, int length) {
    if (length == 0)
        return "";
    
    if ((s.length()) < length)
        return s;
    else
        if (length > 0)
            return s.substring(((s.length()) - length), s.length());
        else {
            return s.substring((-length), s.length());
        }
    
}