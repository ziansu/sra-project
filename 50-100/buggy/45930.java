public int getSpecialCharacterCount(java.lang.String regEx) {
    if (!(hasSpecialCharacters(regEx)))
        return 0;
    
    java.lang.String subRegEx = regEx;
    int specialCharCount = 0;
    while (hasSpecialCharacters(subRegEx)) {
        specialCharCount++;
        java.lang.String lastEscapedChar = getLastSpecialCharacter(subRegEx);
        int lastIndexOf = subRegEx.lastIndexOf(lastEscapedChar);
        subRegEx = subRegEx.substring(0, lastIndexOf);
    } 
    return specialCharCount;
}