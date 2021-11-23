public boolean stringEquals(java.lang.String s1, java.lang.String s2) {
    if ((s1.length()) != (s2.length()))
        return false;
    
    for (int i = 0; i < (s1.length()); i++) {
        if ((s1.charAt(i)) != (s2.charAt(i))) {
            return false;
        }
    }
    return true;
}