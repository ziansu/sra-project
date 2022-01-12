public static int numLeadingSpaces(java.lang.String s) {
    int c = 0;
    for (int i = 0; i < (s.length()); i++) {
        if ((s.charAt(i)) != ' ')
            return c;
        
        c++;
    }
    return c;
}