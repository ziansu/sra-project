public static java.lang.String right(java.lang.String s, int n) {
    if (n <= 0)
        return "";
    
    int start = (s.length()) - n;
    if (n < 0)
        n = 0;
    
    return s.substring(n);
}