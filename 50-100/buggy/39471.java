@java.lang.Override
public void endElement(java.lang.String uri, java.lang.String localName, java.lang.String qName) throws org.xml.sax.SAXException {
    switch (qName) {
        case "document" :
            documentList.add(new de.fh_bielefeld.newsboard.model.RawDocument(title, author, source, creationTime, crawlTime, crawler, rawText));
            break;
    }
}