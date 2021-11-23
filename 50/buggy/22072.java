@org.junit.Test
public void getNodeWithText() throws java.io.IOException {
    java.lang.String s = (xmlDecl) + "<test><hello>hei</hello></test>";
    parseString(s);
    parser.findElement("hello");
    parser.getFirstChild();
    org.junit.Assert.assertEquals("hei", parser.getTextContent());
}