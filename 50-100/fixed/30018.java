private void nextIntConstant() {
    token = intConstantToken;
    java.lang.StringBuilder intString = new java.lang.StringBuilder();
    while (isDigit(source.getChar())) {
        intString.append(source.getChar());
        source.nextChar();
    } 
    try {
        tokenInt = java.lang.Integer.parseInt(intString.toString());
    } catch (java.lang.NumberFormatException ignore) {
        source.error("Integer larger than 32-bit");
    }
    tokenString = intString.toString();
}