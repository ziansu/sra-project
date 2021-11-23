@java.lang.Override
protected boolean end(final java.lang.String uri, final java.lang.String localName, final java.lang.String qName) throws org.xml.sax.SAXException {
    if (vocabulary.isClipboard(localName)) {
        return true;
    }else
        if (vocabulary.isNode(localName)) {
            if (((payload) == null) || (map == null))
                return true;
            
            final org.deidentifier.arx.ARXLattice.ARXNode node = map.get(payload.trim());
            model.getClipboard().addToClipboard(node);
            return true;
        }else {
            return false;
        }
    
}