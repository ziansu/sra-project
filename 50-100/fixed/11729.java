private void readTokens(com.fsck.k9.mail.store.ImapResponseParser.ImapResponse response) throws java.io.IOException {
    response.clear();
    java.lang.String firstToken = ((java.lang.String) (readToken(response)));
    response.add(firstToken);
    if (isStatusResponse(firstToken)) {
        parseResponseText(response);
    }else {
        java.lang.Object token;
        while ((token = readToken(response)) != null) {
            if (!(token instanceof com.fsck.k9.mail.store.ImapResponseParser.ImapList)) {
                response.add(token);
            }
        } 
    }
}