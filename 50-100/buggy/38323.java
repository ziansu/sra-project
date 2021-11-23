private CentralPoint.StatusInfo getClientStatus() throws java.lang.Exception {
    if (doc.getDocumentElement().getChildNodes().item(0).getNodeValue().equals(ConstantTags.ALIVE)) {
        return new CentralPoint.StatusInfo(StatusInfo.ALIVE);
    }else {
        return new CentralPoint.StatusInfo(StatusInfo.DYING);
    }
}