public java.lang.String parseHint() throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
    int intParserEvent = parser.next();
    intParserEvent = parser.next();
    intParserEvent = parser.next();
    java.lang.String stringHint = parser.getText();
    intParserEvent = parser.next();
    intParserEvent = parser.next();
    return stringHint;
}