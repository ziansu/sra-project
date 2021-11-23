private static java.lang.String join(java.lang.String[] set, java.lang.String medium, int offset) {
    java.lang.String s = set[offset];
    int i = 0;
    for (java.lang.String part : set) {
        if (i > offset)
            s = (((s + " ") + medium) + " ") + part;
        
        i++;
    }
    return s;
}