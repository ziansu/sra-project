private void sendInlineEvent(org.xwiki.rendering.wikimodel.xhtml.filter.XHTMLWhitespaceXMLFilter.Event event) throws org.xml.sax.SAXException {
    if ((event.type) == (org.xwiki.rendering.wikimodel.xhtml.filter.XHTMLWhitespaceXMLFilter.Event.Type.BEGIN_ELEMENT)) {
        super.startElement(event.uri, event.localName, event.qName, event.atts);
    }else
        if ((event.type) == (org.xwiki.rendering.wikimodel.xhtml.filter.XHTMLWhitespaceXMLFilter.Event.Type.END_ELEMENT)) {
            super.endElement(event.uri, event.localName, event.qName);
        }else
            if ((event.type) == (org.xwiki.rendering.wikimodel.xhtml.filter.XHTMLWhitespaceXMLFilter.Event.Type.COMMENT)) {
                super.comment(event.content.toCharArray(), 0, event.content.length());
            }
        
    
}