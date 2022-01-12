private java.util.HashSet<java.lang.String> marcxmlCollectionParser(java.io.InputStream xmlstream) throws java.lang.Exception, javax.xml.stream.XMLStreamException {
    java.util.HashSet<java.lang.String> marcRecords = new java.util.HashSet();
    javax.xml.stream.XMLInputFactory input_factory = javax.xml.stream.XMLInputFactory.newInstance();
    javax.xml.stream.XMLStreamReader r = input_factory.createXMLStreamReader(xmlstream);
    while (r.hasNext()) {
        if ((r.next()) == (XMLEvent.START_ELEMENT))
            if (r.getLocalName().equals("record")) {
                marcRecords.add(r.getText());
            }
        
    } 
    return marcRecords;
}