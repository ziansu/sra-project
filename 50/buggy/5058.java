private java.lang.String formatCode(int code) {
    java.lang.String s = code + "";
    while ((s.length()) < 2)
        s = "0" + s;
    
    return s;
}