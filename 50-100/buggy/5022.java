public static java.lang.String toXML(org.w3c.dom.Node node) {
    java.io.StringWriter sw = new java.io.StringWriter();
    try {
        javax.xml.transform.Transformer t = javax.xml.transform.TransformerFactory.newInstance().newTransformer();
        t.setOutputProperty(javax.xml.transform.OutputKeys.OMIT_XML_DECLARATION, "yes");
        t.transform(new javax.xml.transform.dom.DOMSource(node), new javax.xml.transform.stream.StreamResult(sw));
    } catch (javax.xml.transform.TransformerException te) {
        org.epo.ocr.utils.XMLHelper.LOG.equals("nodeToString Transformer Exception");
    }
    return sw.toString();
}