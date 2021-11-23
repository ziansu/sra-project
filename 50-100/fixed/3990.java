public CentralPoint.RegisResponeInfo getRegisterRespone() throws java.lang.Exception {
    java.lang.System.out.println(doc.getDocumentElement().getNodeName());
    if (doc.getDocumentElement().getNodeName().equals(ConstantTags.SESSION_DENY_TAG)) {
        return new CentralPoint.RegisResponeInfo(false);
    }else {
        return new CentralPoint.RegisResponeInfo(getOnlinePeer(), true);
    }
}