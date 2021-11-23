private void writeFile(java.io.File outputFile) throws javax.xml.transform.TransformerException {
    javax.xml.transform.TransformerFactory tFactory = javax.xml.transform.TransformerFactory.newInstance();
    javax.xml.transform.Transformer transformer = tFactory.newTransformer();
    javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(connectDoc);
    javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(outputFile);
    transformer.transform(source, result);
}