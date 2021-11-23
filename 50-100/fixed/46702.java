public java.lang.String parseQuestion() throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
    java.lang.String returnQuestion;
    parser.next();
    parser.next();
    parser.next();
    parser.next();
    returnQuestion = parser.getText();
    parser.next();
    parser.next();
    return returnQuestion;
}