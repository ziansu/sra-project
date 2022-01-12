@java.lang.Override
public java.lang.Boolean getpermsContainDocMDP() {
    org.apache.pdfbox.cos.COSDictionary documentCatalog = this.document.getDocumentCatalog().getCOSObject();
    org.apache.pdfbox.cos.COSDictionary perms = ((org.apache.pdfbox.cos.COSDictionary) (documentCatalog.getDictionaryObject(COSName.PERMS)));
    if (perms == null) {
        org.verapdf.model.impl.pb.pd.signatures.PBoxPDSigRef.LOGGER.error("Document catalog doesn't contain /Perms entry");
        return false;
    }
    return perms.containsKey(COSName.DOC_MDP);
}