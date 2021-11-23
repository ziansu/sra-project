private CentralPoint.FileContentInfo getContent() throws java.lang.Exception {
    switch (doc.getDocumentElement().getNodeName()) {
        case ConstantTags.FILE_DATA_BEGIN_TAG :
            return new CentralPoint.FileContentInfo(true, null, false);
        case ConstantTags.FILE_DATA_TAG :
            return new CentralPoint.FileContentInfo(true, doc.getDocumentElement().getChildNodes().item(0).getNodeValue().getBytes(), false);
        default :
            return new CentralPoint.FileContentInfo(true, null, true);
    }
}