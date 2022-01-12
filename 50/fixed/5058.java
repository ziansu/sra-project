private java.lang.String formatCode(int code, int n) {
    java.lang.String s = code + "";
    while ((s.length()) < n)
        s = "0" + s;
    
    return s;
}