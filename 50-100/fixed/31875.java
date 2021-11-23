private void saveToFile(org.w3c.dom.Document document, java.io.File outputFile, javax.xml.transform.Transformer transformer) throws java.io.FileNotFoundException, javax.xml.transform.TransformerException {
    javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(new java.io.FileOutputStream(outputFile));
    javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(document);
    transformer.transform(source, result);
}