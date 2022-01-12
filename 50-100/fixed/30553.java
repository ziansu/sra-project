@org.junit.Test
public void attributeWithDoubleEqualsSign() throws java.io.IOException {
    java.lang.String xml = "<element a==\"qwe\"></element>";
    com.tickaroo.tikxml.XmlReader reader = com.tickaroo.tikxml.TestUtils.readerFrom(xml);
    try {
        reader.beginElement();
        reader.nextElementName();
        reader.nextAttributeName();
        exception.expect(java.io.IOException.class);
        reader.nextAttributeValue();
    } finally {
        reader.close();
    }
}