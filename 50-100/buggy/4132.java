public static boolean multcomp(java.lang.String[] s, java.lang.String[] r) {
    int i = 0;
    while (i < (s.length)) {
        if (java.util.Arrays.asList(s).contains(r[i])) {
            return true;
        }
        i++;
    } 
    return false;
}