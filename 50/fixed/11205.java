@org.junit.Test
public void makeRequest() throws javax.xml.parsers.ParserConfigurationException {
    org.w3c.dom.Document xmlRequest = request.getRequestXML(exampleInfo);
    java.lang.String result = handler.makeRequest(xmlRequest);
}