public void setToscaCustomization(java.lang.String customizationId, java.lang.String xml) {
    org.xml.sax.InputSource source = new org.xml.sax.InputSource(new java.io.StringReader(xml));
    try {
        org.apache.xerces.dom.DocumentImpl document = ((org.apache.xerces.dom.DocumentImpl) (this.db.parse(source)));
        this.xdocHash.put(customizationId, document);
    } catch (org.xml.sax.SAXException e1) {
        e1.printStackTrace();
    } catch (java.io.IOException e1) {
        e1.printStackTrace();
    }
}