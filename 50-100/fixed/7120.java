public static boolean isTaskNameMatching(java.io.File file, java.lang.String taskName) throws edu.brandeis.cs.nlp.mae.io.MaeIOException {
    try {
        edu.brandeis.cs.nlp.mae.io.MaeXMLParser loader = new edu.brandeis.cs.nlp.mae.io.MaeXMLParser();
        return loader.isTaskNameMatching(file, taskName);
    } catch (java.io.IOException e) {
        edu.brandeis.cs.nlp.mae.io.AnnotationLoader.catchIOError(file, e);
    } catch (org.xml.sax.SAXParseException e) {
        edu.brandeis.cs.nlp.mae.io.AnnotationLoader.catchSAXParseError(e);
    } catch (org.xml.sax.SAXException e) {
        edu.brandeis.cs.nlp.mae.io.AnnotationLoader.catchSAXError(file, e);
    }
    return false;
}