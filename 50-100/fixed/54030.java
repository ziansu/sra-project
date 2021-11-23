public static java.lang.String updatePOM(org.apache.commons.fileupload.FileItem _inputFile) {
    java.lang.String strUpdated = "";
    try {
        strUpdated = fr.paris.lutece.plugins.lutecetools.service.XMLParser.process(_inputFile);
    } catch (java.io.IOException | javax.xml.parsers.ParserConfigurationException | org.xml.sax.SAXException | javax.xml.transform.TransformerException e) {
        fr.paris.lutece.portal.service.util.AppLogService.error(e.getMessage());
    }
    return strUpdated;
}