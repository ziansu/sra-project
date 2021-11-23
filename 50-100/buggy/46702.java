public java.lang.String parseQuestion() throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
    int intParserEvent;
    java.lang.String returnQuestion;
    intParserEvent = parser.next();
    intParserEvent = parser.next();
    intParserEvent = parser.next();
    intParserEvent = parser.next();
    returnQuestion = parser.getText();
    intParserEvent = parser.next();
    intParserEvent = parser.next();
    return returnQuestion;
}