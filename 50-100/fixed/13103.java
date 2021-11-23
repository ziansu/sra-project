public java.lang.String parseHint() throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
    parser.next();
    parser.next();
    parser.next();
    java.lang.String stringHint = parser.getText();
    parser.next();
    parser.next();
    return stringHint;
}