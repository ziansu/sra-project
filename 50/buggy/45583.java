private CentralPoint.ChatRequestInfo getChatRequest() throws java.lang.Exception {
    return new CentralPoint.ChatRequestInfo(Server.UserDatabase.getTargetValue(ConstantTags.USERNAME_TAG, doc.getDocumentElement()));
}