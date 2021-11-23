private java.lang.String readActiveIngredient(org.xmlpull.v1.XmlPullParser parser) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
    while ((parser.getAttributeValue(ch.arkathon.pillrecognizer.activities.PillDetailsActivity.NS, "durchschuss")) == null)
        skipToNextTagStart(parser, "p");
    
    skipToNextTagEnd(parser, "i");
    parser.next();
    java.lang.String result = parser.getText();
    if (result.endsWith("."))
        result = result.substring(0, ((result.length()) - 1));
    
    return result;
}