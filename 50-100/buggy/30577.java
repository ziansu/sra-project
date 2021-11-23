public java.util.List parse(java.io.InputStream in) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
    try {
        org.xmlpull.v1.XmlPullParser parser = android.util.Xml.newPullParser();
        parser.setFeature(org.xmlpull.v1.XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
        parser.setInput(in, null);
        parser.nextTag();
        return readFeed(parser);
    } finally {
        in.close();
    }
}