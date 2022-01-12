@java.lang.Override
void build(javax.xml.stream.XMLEventReader reader, javax.xml.stream.events.StartElement element, org.apache.olingo.server.core.SchemaBasedEdmProvider provider, java.lang.String name) throws javax.xml.stream.XMLStreamException {
    java.lang.String version = attr(element, "Version");
    if ("4.0".equals(version)) {
        readDataServicesAndReference(reader, element, provider);
    }
}