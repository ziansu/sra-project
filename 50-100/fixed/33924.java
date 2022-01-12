private boolean alphabeticName(java.lang.String name) {
    for (int i = 0; i < (name.length()); i++) {
        char ch = name.charAt(i);
        if (!(java.lang.Character.isAlphabetic(ch)))
            return false;
        
    }
    return true;
}