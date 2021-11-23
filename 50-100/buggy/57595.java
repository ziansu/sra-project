private static void setContainerStyle(org.xmlpull.v1.XmlPullParser parser, java.util.HashMap<java.lang.String, com.google.maps.android.kml.KmlStyle> containerStyles) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
    java.lang.Boolean hasStyleId = (parser.getAttributeValue(null, "id")) != null;
    if (hasStyleId) {
        com.google.maps.android.kml.KmlStyle style = com.google.maps.android.kml.KmlStyleParser.createStyle(parser);
        java.lang.String styleId = style.getStyleId();
        containerStyles.put(styleId, style);
    }
}