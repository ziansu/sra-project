public static <T> T parse(java.lang.String xml, java.lang.Class<T> classOfT) throws com.loopme.customparser.xml.XmlParserException {
    try {
        org.xmlpull.v1.XmlPullParserFactory factory = org.xmlpull.v1.XmlPullParserFactory.newInstance();
        org.xmlpull.v1.XmlPullParser parser = factory.newPullParser();
        parser.setInput(new java.io.StringReader(xml));
        return com.loopme.customparser.xml.XmlParser.parseRoot(parser, classOfT);
    } catch (org.xmlpull.v1.XmlPullParserException e) {
        throw new com.loopme.customparser.xml.XmlParserException("Can't init XmlPullParser");
    } catch (java.lang.Exception e) {
        throw new com.loopme.customparser.xml.XmlParserException("XML parsing failed", e);
    }
}