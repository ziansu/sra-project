public static org.sbolstandard.core2.SBOLDocument read(java.io.BufferedInputStream in) throws java.io.IOException, org.sbolstandard.core2.SBOLValidationException {
    org.sbolstandard.core2.SBOLDocument doc = new org.sbolstandard.core2.SBOLDocument();
    doc.setCreateDefaults(true);
    if ((org.sbolstandard.core2.GenBank.URIPrefix) == null) {
        throw new org.sbolstandard.core2.SBOLValidationException("No URI prefix has been provided.");
    }
    doc.setDefaultURIprefix(org.sbolstandard.core2.GenBank.URIPrefix);
    org.sbolstandard.core2.GenBank.read(doc, in);
    return doc;
}