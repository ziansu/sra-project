protected java.util.HashMap doInBackground(java.lang.Void... nothing) {
    javax.xml.parsers.SAXParser parser;
    try {
        parser = javax.xml.parsers.SAXParserFactory.newInstance().newSAXParser();
    } catch (javax.xml.parsers.ParserConfigurationException e) {
        return null;
    } catch (org.xml.sax.SAXException e) {
        return null;
    }
    handler = new com.jams.music.player.Parser.WikiHandler();
    try {
        parser.parse(response, handler);
    } catch (org.xml.sax.SAXException e) {
        return null;
    } catch (java.io.IOException e) {
        return null;
    }
    return handler.getWikiInfo();
}