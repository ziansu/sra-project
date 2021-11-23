private java.lang.String parseHeadline(com.ximpleware.VTDNav vn) throws com.ximpleware.NavException {
    edu.jhu.agiga.AgigaSentenceReader.require(vn.matchElement(AgigaConstants.DOC));
    if ((!(vn.toElement(VTDNav.FIRST_CHILD, AgigaConstants.HEADLINE))) || ((vn.getText()) == (-1))) {
        edu.jhu.agiga.AgigaDocumentReader.log.finer("No headline found");
        return null;
    }
    return vn.toString(vn.getText()).trim();
}