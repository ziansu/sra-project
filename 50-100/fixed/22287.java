@javax.annotation.PostConstruct
private void init() {
    javax.xml.validation.SchemaFactory schemaFactory = javax.xml.validation.SchemaFactory.newInstance(javax.xml.XMLConstants.W3C_XML_SCHEMA_NS_URI);
    javax.xml.validation.Schema schema = null;
    try {
        java.net.URL schemaURL = getClass().getResource(com.validator.service.ValidatorServiceImpl.XSD_SCHEMA_PATH);
        schema = schemaFactory.newSchema(new java.io.File(schemaURL.getPath()));
    } catch (org.xml.sax.SAXException e) {
        e.printStackTrace();
    }
    validator = schema.newValidator();
}