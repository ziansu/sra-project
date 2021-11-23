private java.lang.String parseXmlFare(org.xmlpull.v1.XmlPullParser parser) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
    int eventType = parser.getEventType();
    while (eventType != (org.xmlpull.v1.XmlPullParser.END_DOCUMENT)) {
        java.lang.String name;
        switch (eventType) {
            case org.xmlpull.v1.XmlPullParser.START_DOCUMENT :
                break;
            case org.xmlpull.v1.XmlPullParser.START_TAG :
                name = parser.getName();
                if (name.equals("fare")) {
                    return parser.nextText();
                }
                break;
        }
        eventType = parser.next();
    } 
    return null;
}