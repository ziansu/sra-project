public CentralPoint.FileNameInfo getFileName() throws java.lang.Exception {
    return new CentralPoint.FileNameInfo(doc.getDocumentElement().getChildNodes().item(0).getNodeValue());
}