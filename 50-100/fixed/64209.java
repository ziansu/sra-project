private com.acc.util.Token handleConstants(java.lang.StringBuilder token, char currentChar) {
    while (java.lang.Character.isDigit(currentChar)) {
        token.append(currentChar);
        (currentPointer)++;
        currentChar = input.charAt(currentPointer);
    } 
    return new com.acc.util.Constant(token.toString());
}