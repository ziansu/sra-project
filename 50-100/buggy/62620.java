private org.apache.olingo.commons.api.edm.FullQualifiedName readType(javax.xml.stream.events.StartElement element) {
    java.lang.String type = attr(element, "Type");
    if ((type.startsWith("Collection(")) && (type.endsWith(")"))) {
        return new org.apache.olingo.commons.api.edm.FullQualifiedName(type.substring(11, ((type.length()) - 1)));
    }
    return new org.apache.olingo.commons.api.edm.FullQualifiedName(type);
}