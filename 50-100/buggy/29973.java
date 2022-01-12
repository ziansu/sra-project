public java.lang.Object unmarshallPayload(org.jivesoftware.smack.packet.Packet packet) throws java.lang.Exception {
    org.w3c.dom.Element element = getElementAny(packet);
    java.lang.String namespace = element.lookupNamespaceURI(element.getPrefix());
    jaxb.Unmarshaller u = getUnmarshaller(namespace);
    java.lang.String xml = nodeToString(element);
    java.lang.Object payload = u.unmarshal(new org.xml.sax.InputSource(new java.io.StringReader(xml)));
    return payload;
}