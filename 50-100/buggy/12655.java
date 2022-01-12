@java.lang.Override
public void startElement(java.lang.String uri, java.lang.String localName, java.lang.String qName, org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
    sinlin.Tag tag = new sinlin.Tag(qName, attributes);
    if (!(arrayDeque.isEmpty())) {
        arrayDeque.peek().addNodeTag(tag);
    }
    arrayDeque.push(tag);
}