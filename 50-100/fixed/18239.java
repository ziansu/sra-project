public static java.lang.String parseEnveloppe(java.lang.String wrappedMessage) throws java.io.IOException, javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXException {
    java.lang.String message = "";
    javax.xml.parsers.DocumentBuilderFactory docFactory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
    javax.xml.parsers.DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
    org.w3c.dom.Document doc = docBuilder.parse(org.apache.commons.io.IOUtils.toInputStream(wrappedMessage.replace("\n", "")));
    java.lang.String encodedEdifactMessage = gov.nist.hit.utils.XMLUtils.getNodeByNameOrXPath("/Message/Body/EDIFACTMessage", doc).getTextContent();
    message = new java.lang.String(org.apache.commons.codec.binary.Base64.decodeBase64(encodedEdifactMessage), org.apache.commons.io.Charsets.UTF_8);
    return message;
}