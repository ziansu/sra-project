public static boolean oneReplace(java.lang.String s1, java.lang.String s2) {
    int diff = 0;
    for (int i = 0; i < (s1.length()); i++) {
        if ((s1.charAt(i)) != (s2.charAt(i))) {
            if ((++diff) == 2)
                return false;
            
        }
    }
    return true;
}