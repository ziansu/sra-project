public static void checkAssetDefinitionsValidity(java.io.File xmlFile, java.lang.String schemaLocation) throws java.io.IOException, org.xml.sax.SAXException {
    javax.xml.transform.Source schemaFile = new javax.xml.transform.stream.StreamSource(new java.io.File(schemaLocation));
    javax.xml.transform.Source stream = new javax.xml.transform.stream.StreamSource(xmlFile);
    javax.xml.validation.SchemaFactory factory = javax.xml.validation.SchemaFactory.newInstance(javax.xml.XMLConstants.W3C_XML_SCHEMA_NS_URI);
    javax.xml.validation.Schema schema = factory.newSchema(schemaFile);
    javax.xml.validation.Validator validator = schema.newValidator();
    validator.validate(stream);
}