public java.lang.String nextToken() {
    int posToken;
    java.lang.String response;
    if (strToValidate.contains(delim)) {
        posToken = scanToken(posTokens, strToValidate);
        response = strToValidate.substring(0, posToken);
        strToValidate = strToValidate.substring(posToken);
        return response.replace(delim, "");
    }
    return null;
}