public int getSpecialCharactersEscapedCount(java.lang.String regEx) {
    java.lang.String subRegEx = regEx;
    int specialCharCount = 0;
    while (hasSpecialCharactersEscaped(subRegEx)) {
        specialCharCount++;
        java.lang.String lastEscapedChar = getLastEscapedSpecialCharacter(subRegEx);
        int lastIndexOf = subRegEx.lastIndexOf(lastEscapedChar);
        subRegEx = subRegEx.substring(0, lastIndexOf);
    } 
    return specialCharCount;
}