public static boolean checkStringIsValid(java.lang.String entryString) {
    if (!(io.github.tryexceptelse.jdex.be.entries.ContactEntry.checkStringIsValid(entryString)))
        return false;
    
    if (entryString == null)
        return false;
    
    java.lang.String str = entryString;
    for (int i = 0; i < (str.length()); i++) {
        if ((str.charAt(i)) != ' ') {
            return true;
        }
    }
    return false;
}