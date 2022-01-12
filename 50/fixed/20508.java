private <W> org.opennms.core.xml.XmlHandler<W> createXmlHandler(java.lang.Class<W> clazz) {
    try {
        return new org.opennms.core.xml.XmlHandler(clazz);
    } catch (java.lang.Throwable t) {
        return new org.opennms.core.xml.XmlHandler(clazz);
    }
}