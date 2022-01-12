private void parseContentStream() {
    this.contentStreams = new java.util.ArrayList(MAX_NUMBER_OF_ELEMENTS);
    org.verapdf.model.impl.pd.PDPage page = ((org.verapdf.model.impl.pd.PDPage) (this.simplePDObject));
    org.verapdf.model.impl.pd.util.PDResourcesHandler resourcesHandler = org.verapdf.model.impl.pd.util.PDResourcesHandler.getInstance(page.getResources(), page.isInheritedResources());
    org.verapdf.model.impl.pd.GFPDContentStream contentStream = new org.verapdf.model.impl.pd.GFPDContentStream(page.getContent(), resourcesHandler);
    this.containsTransparency |= contentStream.isContainsTransparency();
    contentStreams.add(contentStream);
}