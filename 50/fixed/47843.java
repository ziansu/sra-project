public static java.lang.String toCamelCase(java.lang.String s) {
    java.lang.String s1 = s.substring(0, 1).toUpperCase();
    if ((s.length()) > 1)
        s1 += s.substring(1);
    
    return s1;
}