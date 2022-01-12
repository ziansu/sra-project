private void readXML(java.lang.String filePath) {
    javax.xml.parsers.SAXParserFactory saxParserFactory = javax.xml.parsers.SAXParserFactory.newInstance();
    try {
        javax.xml.parsers.SAXParser saxParser = saxParserFactory.newSAXParser();
        saxParser.parse(filePath, filteringHandler);
    } catch (javax.xml.parsers.ParserConfigurationException e) {
        e.printStackTrace();
    } catch (org.xml.sax.SAXException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}