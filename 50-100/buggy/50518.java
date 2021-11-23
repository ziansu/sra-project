private CentralPoint.FileAckInfo getFileAck() throws java.lang.Exception {
    if (doc.getDocumentElement().getNodeName().equals(ConstantTags.FILE_REQ_NOACK_TAG))
        return new CentralPoint.FileAckInfo(false);
    else
        return new CentralPoint.FileAckInfo(true, java.lang.Integer.parseInt(Server.UserDatabase.getTargetValue(ConstantTags.PORT_TAG, doc.getDocumentElement())));
    
}