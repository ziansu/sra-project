@org.junit.Test
public void unclosedElement() throws java.io.IOException {
    java.lang.String xml = "<fooElement a=\"qwe\">This is the text";
    com.tickaroo.tikxml.XmlReader reader = com.tickaroo.tikxml.TestUtils.readerFrom(xml);
    try {
        reader.beginElement();
        reader.nextElementName();
        reader.nextAttributeName();
        reader.nextAttributeValue();
        exception.expect(java.io.IOException.class);
        exception.expectMessage("Unterminated element text content. Expected </fooElement> but haven't found at path /fooElement/text()");
        reader.nextTextContent();
    } finally {
        reader.close();
    }
}