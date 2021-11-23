protected static java.lang.String[] createNames(int nameCount, java.lang.String preamble) {
    if (preamble == null)
        preamble = "V";
    
    int i = 0;
    java.lang.String[] n = new java.lang.String[nameCount];
    while (i < nameCount) {
        n[i] = preamble + (++i);
    } 
    return n;
}