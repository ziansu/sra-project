private void resetDocument() {
    if (!(this.sentBeginWikiSpace)) {
        this.currentSpaceReference = null;
        this.currentLegacySpace = null;
    }
    this.currentDocumentReference = null;
    this.currentLegacyDocument = null;
    this.currentDocumentLocale = null;
    this.currentDocumentRevision = null;
    this.currentDocumentParameters = new org.xwiki.filter.FilterEventParameters();
    this.currentDocumentLocaleParameters = new org.xwiki.filter.FilterEventParameters();
    this.currentDocumentRevisionParameters = new org.xwiki.filter.FilterEventParameters();
    this.sentBeginWikiDocument = false;
    this.sentBeginWikiDocumentLocale = false;
    this.sentBeginWikiDocumentRevision = false;
}