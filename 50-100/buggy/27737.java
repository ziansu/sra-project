public java.lang.String checkServerEncryption() throws java.io.IOException, java.lang.IllegalArgumentException, jhgdc.library.JHGDException {
    if (!(connected)) {
        throw new java.lang.IllegalStateException("Client not connected");
    }
    if (!(authenticated)) {
        throw new java.lang.IllegalStateException("Client not authenticated");
    }
    sendLineCommand("encrypt?");
    java.lang.String returnMessage = input.readLine();
    if ((checkServerResponse(returnMessage)) == (HGDConsts.FAILURE)) {
        throw new jhgdc.library.JHGDException(returnMessage.substring(((returnMessage.indexOf('|')) + 1)));
    }
    return returnMessage;
}