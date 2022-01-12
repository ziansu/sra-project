public java.lang.String nextToken() {
    int posToken;
    java.lang.String response;
    posToken = scanToken(posTokens, strToValidate);
    response = strToValidate.substring(0, (posToken - (delim.length())));
    strToValidate = strToValidate.substring(posToken);
    return response;
}