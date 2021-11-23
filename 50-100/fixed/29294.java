public static java.lang.String[] divKeyValue(java.lang.String line, java.lang.String delim) {
    int x = line.indexOf(delim);
    if (x < 0)
        return new java.lang.String[]{ line };
    
    java.lang.String s1 = line.substring(0, x);
    java.lang.String s2 = line.substring((x + 1));
    return new java.lang.String[]{ s1 , s2 };
}