private CentralPoint.ChatResponeInfo getChatRespone() throws java.lang.Exception {
    return new CentralPoint.ChatResponeInfo(doc.getDocumentElement().getNodeName().equals(ConstantTags.CHAT_ACCEPT_TAG));
}