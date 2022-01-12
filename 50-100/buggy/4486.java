public static java.lang.String left(java.lang.String s, int length) {
    if (length == 0)
        return "";
    else
        if (length > 0)
            return s.substring(0, length);
        else {
            return s.substring(0, ((s.length()) + length));
        }
    
}