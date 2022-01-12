public int countTokens() {
    java.lang.String lstrToValidate = strToValidate;
    int result = 0;
    while (lstrToValidate.contains(delim)) {
        int currentMaxPosicion = lstrToValidate.length();
        if ((posTokens) < currentMaxPosicion) {
            lstrToValidate = lstrToValidate.substring(scanToken(posTokens, lstrToValidate), currentMaxPosicion);
            result++;
        }
    } 
    return result;
}