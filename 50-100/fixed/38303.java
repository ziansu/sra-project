private void nextName() {
    java.lang.StringBuilder nameString = new java.lang.StringBuilder();
    while ((isLetter(source.getChar())) || (isDigit(source.getChar()))) {
        nameString.append(source.getChar());
        source.nextChar();
    } 
    tokenString = nameString.toString();
    if (isReserved(tokenString)) {
        token = getReserved(tokenString);
    }else {
        token = nameToken;
    }
}