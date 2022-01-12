private void appendActionImports(final javax.xml.stream.XMLStreamWriter writer, final java.util.List<org.apache.olingo.commons.api.edm.EdmActionImport> actionImports) throws javax.xml.stream.XMLStreamException {
    for (org.apache.olingo.commons.api.edm.EdmActionImport actionImport : actionImports) {
        writer.writeStartElement(org.apache.olingo.server.core.serializer.xml.MetadataDocumentXmlSerializer.XML_ACTION_IMPORT);
        writer.writeAttribute(org.apache.olingo.server.core.serializer.xml.MetadataDocumentXmlSerializer.XML_NAME, actionImport.getName());
        writer.writeAttribute(org.apache.olingo.server.core.serializer.xml.MetadataDocumentXmlSerializer.XML_ACTION, getAliasedFullQualifiedName(actionImport.getUnboundAction(), false));
        appendAnnotations(writer, actionImport);
        writer.writeEndElement();
    }
}