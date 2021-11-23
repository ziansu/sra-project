public static org.w3c.dom.Document loadDocument(java.io.File file, boolean ignorComments) throws java.io.IOException, org.xml.sax.SAXException {
    java.io.InputStream in = jef.tools.IOUtils.getInputStream(file);
    try {
        org.w3c.dom.Document document = jef.tools.XMLUtils.loadDocument(in, null, ignorComments, false);
        return document;
    } finally {
        in.close();
    }
}