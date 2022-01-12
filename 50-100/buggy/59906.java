public java.lang.String getKeywordnInString(java.lang.String userInput, int startOfDesc, int endOfDesc) {
    java.lang.StringBuilder result = new java.lang.StringBuilder();
    char[] userInputCharArr = userInput.toCharArray();
    for (int c = 0; c < (userInputCharArr.length); c++) {
        if ((c >= startOfDesc) && (c <= endOfDesc)) {
            result.append(userInputCharArr[c]);
        }
    }
    return result.toString();
}