private void ifThereIsMatchAddItToTotalTokens(char[] tokenBuffer) {
    if (((tokenLength) > 0) && ((termAtt.length()) > 0)) {
        final java.lang.String token = java.lang.String.copyValueOf(tokenBuffer, 0, termAtt.length());
        totalTokens.put(token, new java.lang.Integer[]{ tokenStart , tokenEnd , token.length() , 1 });
    }
}