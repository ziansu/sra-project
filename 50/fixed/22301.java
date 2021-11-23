public static void deserialize(java.io.InputStream aStream, org.apache.uima.cas.CAS aCAS) throws java.io.IOException, org.xml.sax.SAXException {
    org.apache.uima.util.XmlCasDeserializer.deserialize(aStream, aCAS, false);
}