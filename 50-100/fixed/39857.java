private static org.verapdf.metadata.fixer.gf.impl.model.MetadataImpl parseMetadata(org.verapdf.pd.PDMetadata meta, org.verapdf.pd.PDDocument document) {
    try {
        com.adobe.xmp.impl.VeraPDFMeta xmp = com.adobe.xmp.impl.VeraPDFMeta.parse(meta.getStream());
        if (xmp != null) {
            return new org.verapdf.metadata.fixer.gf.impl.model.MetadataImpl(xmp, meta.getObject(), document.getDocument(), false);
        }
    } catch (com.adobe.xmp.XMPException e) {
        org.verapdf.metadata.fixer.gf.impl.model.PDFDocumentImpl.LOGGER.log(java.util.logging.Level.FINE, ("Problems with XMP parsing. " + (e.getMessage())), e);
    }
    return null;
}