@java.lang.Override
public javax.xml.stream.XMLEventReader handle(org.apache.http.client.methods.CloseableHttpResponse httpResponse) {
    javax.xml.stream.XMLInputFactory ifactory = javax.xml.stream.XMLInputFactory.newFactory();
    ifactory.setProperty(javax.xml.stream.XMLInputFactory.IS_VALIDATING, false);
    try {
        return ifactory.createXMLEventReader(httpResponse.getEntity().getContent(), encoding);
    } catch (javax.xml.stream.XMLStreamException e) {
        throw new com.company.readerproviders.exception.XmlProcessingException("Unable to process http response!", e);
    } catch (java.io.IOException e) {
        throw new com.company.readerproviders.exception.IOResponseHandleException("I/O exception!", e);
    }
}