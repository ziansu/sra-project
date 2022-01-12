private boolean discovering() {
    final eu.modelwriter.traceability.core.persistence.DocumentRoot documentRootDiscovering = getDocumentRoot();
    final eu.modelwriter.traceability.core.persistence.DocumentRoot documentRootOriginal = eu.modelwriter.configuration.internal.AlloyUtilities.getDocumentRoot();
    if (documentRootDiscovering == null) {
        java.lang.System.err.println((("Document root on location " + (xmlPath)) + " is NULL."));
        return false;
    }
    discover(documentRootOriginal, documentRootOriginal);
    return true;
}