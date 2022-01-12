private com.eamonndunne.tfl.JamCamRoot unmarshalCamXMLString(java.lang.String xmlData) {
    org.simpleframework.xml.Serializer serializer = new org.simpleframework.xml.core.Persister();
    java.io.Reader reader = new java.io.StringReader(xmlData);
    com.eamonndunne.tfl.JamCamRoot jamCamRoot = null;
    try {
        jamCamRoot = serializer.read(com.eamonndunne.tfl.JamCamRoot.class, reader, false);
    } catch (java.lang.Exception e) {
        com.eamonndunne.JamCamController.log.error("Error when attempting to unmarshal camera XML data", e);
    }
    return jamCamRoot;
}