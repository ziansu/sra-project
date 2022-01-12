private java.lang.String getImageId(org.w3c.dom.Element pictElement) {
    java.lang.String imgId = null;
    org.w3c.dom.Node imageData = getElement(pictElement, org.eclipse.osee.define.report.internal.wordupdate.WordImageArtifactElementExtractor.IMAGE);
    if (imageData != null) {
        org.w3c.dom.Node srcAttribute = imageData.getAttributes().getNamedItem(org.eclipse.osee.define.report.internal.wordupdate.WordImageArtifactElementExtractor.SRC);
        if (srcAttribute != null) {
            imgId = srcAttribute.getNodeValue();
        }
    }
    return imgId;
}