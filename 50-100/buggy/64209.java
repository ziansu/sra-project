private com.acc.util.Token handleConstants(java.lang.StringBuilder token, char currentChar) {
    int constant = 0;
    do {
        currentChar = input.charAt(((currentPointer)++));
        token.append(currentChar);
    } while (((currentPointer) < (input.length())) && (java.lang.Character.isDigit(currentChar)) );
    constant = java.lang.Integer.valueOf(token.toString());
    return new com.acc.util.Constant(constant);
}