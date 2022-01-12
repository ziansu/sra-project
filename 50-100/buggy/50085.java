private java.lang.String getMetadataUrl(org.w3c.dom.Document doc) {
    java.lang.String metadataUrl = "";
    try {
        org.w3c.dom.Element elem = ((org.w3c.dom.Element) (org.auscope.portal.core.util.DOMUtil.compileXPathExpr(org.auscope.portal.core.services.responses.wms.GetCapabilitiesRecord_1_1_1.METADATAURLREXPRESSION).evaluate(doc, javax.xml.xpath.XPathConstants.NODE)));
        metadataUrl = elem.getAttribute("xlink:href");
    } catch (javax.xml.xpath.XPathExpressionException e) {
        log.error(("GetCapabilities MetadataURL xml parsing error: " + (e.getMessage())));
    }
    return metadataUrl;
}