public CentralPoint.PeerInfo getLogin() throws java.lang.Exception {
    java.lang.String username = Server.UserDatabase.getTargetValue(ConstantTags.USERNAME_TAG, doc.getDocumentElement());
    java.lang.String password = Server.UserDatabase.getTargetValue(ConstantTags.PASSWORD_TAG, doc.getDocumentElement());
    int portNum = java.lang.Integer.parseInt(Server.UserDatabase.getTargetValue(ConstantTags.PORT_TAG, doc.getDocumentElement()));
    return new CentralPoint.PeerInfo(username, password, portNum, PeerInfo.LOGIN);
}