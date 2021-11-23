private void writeKeyDef(final org.dita.dost.module.GenMapAndTopicListModule.KeyDef keyDef) {
    try {
        keydef.writeStartElement("keydef");
        keydef.writeAttribute("keys", keyDef.keys);
        if ((keyDef.href) != null) {
            keydef.writeAttribute("href", keyDef.href);
        }
        if ((keyDef.source) != null) {
            keydef.writeAttribute("source", keyDef.source);
        }
        keydef.writeEndElement();
    } catch (final org.xml.sax.SAXException e) {
        logger.logException(e);
    }
}