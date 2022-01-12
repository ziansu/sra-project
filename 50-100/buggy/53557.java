private java.io.FileOutputStream saveConversationHeaders() throws java.io.IOException {
    java.io.FileOutputStream conversationStream = null;
    try {
        conversationStream = new java.io.FileOutputStream(conversationFile);
        localConversationHeaders.write(conversationStream, conversationHeaders);
    } catch (java.io.FileNotFoundException exception) {
        java.lang.System.out.println("ERROR:Unacceptable file path");
        exception.printStackTrace();
        throw exception;
    } catch (java.io.IOException exception) {
        java.lang.System.out.println("ERROR:Failed to get ConversationHeaderStream!");
        exception.printStackTrace();
        throw exception;
    }
    return conversationStream;
}