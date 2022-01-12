public int countTokens() {
    java.lang.String lstrToValidate = strToValidate;
    int result = 0;
    while (lstrToValidate.contains(delim)) {
        lstrToValidate = lstrToValidate.substring(scanToken(0, lstrToValidate), lstrToValidate.length());
        result++;
    } 
    return result;
}