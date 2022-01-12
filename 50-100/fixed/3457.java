public java.lang.String readAsXml(java.io.File file) throws edu.brandeis.cs.nlp.mae.database.MaeDBException, edu.brandeis.cs.nlp.mae.io.MaeIOException {
    try {
        edu.brandeis.cs.nlp.mae.io.MaeXMLParser parser = parseAsXml(file);
        writeParseToDB(parser);
        return parser.getParseWarnings();
    } catch (edu.brandeis.cs.nlp.mae.database.MaeDBException e) {
        throw e;
    } catch (java.io.IOException e) {
        edu.brandeis.cs.nlp.mae.io.AnnotationLoader.catchIOError(file, e);
    } catch (org.xml.sax.SAXParseException e) {
        edu.brandeis.cs.nlp.mae.io.AnnotationLoader.catchSAXParseError(e);
    } catch (org.xml.sax.SAXException e) {
        edu.brandeis.cs.nlp.mae.io.AnnotationLoader.catchSAXError(file, e);
    }
    return "";
}