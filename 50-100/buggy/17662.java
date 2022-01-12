public boolean isIdentifier(java.lang.String str) {
    char ch = str.charAt(0);
    if (isLetter(ch)) {
        for (int i = 1; i < (str.length()); i++) {
            ch = str.charAt(i);
            if ((!(isDigit(ch))) && (isLetter(ch))) {
                return false;
            }
        }
        return true;
    }
    return false;
}