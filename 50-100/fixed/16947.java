public static java.lang.String autoDetectParseToStringExample(java.lang.String path) throws java.io.IOException, org.apache.tika.exception.TikaException, org.xml.sax.SAXException {
    org.apache.tika.sax.BodyContentHandler handler = new org.apache.tika.sax.BodyContentHandler((-1));
    org.apache.tika.parser.AutoDetectParser parser = new org.apache.tika.parser.AutoDetectParser();
    org.apache.spark.sql.types.Metadata metadata = new org.apache.spark.sql.types.Metadata();
    try (java.io.InputStream stream = new java.io.FileInputStream(path)) {
        parser.parse(stream, handler, metadata);
        stream.close();
        return handler.toString();
    }
}