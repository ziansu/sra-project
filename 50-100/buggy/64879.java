public static boolean checkStringIsValid(java.lang.String entryString) {
    if (!(io.github.tryexceptelse.jdex.be.entries.ContactEntry.checkStringIsValid(entryString)))
        return false;
    else
        if (entryString == null)
            return false;
        
    
    java.lang.String str = new java.lang.String(entryString);
    for (int i = 0; i < (str.length()); i++) {
        if ((str.charAt(i)) != ' ') {
            return true;
        }else {
            return false;
        }
    }
    return true;
}