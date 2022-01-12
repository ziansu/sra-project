@java.lang.Override
public void endElement(java.lang.String uri, java.lang.String localName, java.lang.String qName) throws org.xml.sax.SAXException {
    if ("document".equals(qName)) {
        documentList.add(new de.fh_bielefeld.newsboard.model.RawDocument(title, author, source, creationTime, crawlTime, crawler, rawText));
    }
}