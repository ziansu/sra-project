private java.net.URI readConfigDescriptionURI(org.eclipse.smarthome.config.xml.util.NodeIterator nodeIterator) throws com.thoughtworks.xstream.converters.ConversionException {
    java.lang.String uriText = nodeIterator.nextAttribute("config-description-ref", "uri", false);
    if (uriText != null) {
        try {
            return new java.net.URI(uriText);
        } catch (java.net.URISyntaxException ex) {
            throw new com.thoughtworks.xstream.converters.ConversionException(((("The URI '" + uriText) + "' in node ") + "'config-description-ref' is invalid!"), ex);
        }
    }
    return null;
}