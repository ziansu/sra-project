@org.junit.Test
public void testGetAttributeUnsignedIntValue_StringStringInt() throws java.lang.Exception {
    forgeAndOpenDocument("<foo xmlns:bar=\"12\"/>");
    org.assertj.core.api.Assertions.assertThat(parser.getAttributeUnsignedIntValue(org.robolectric.res.builder.XmlResourceParserImplTest.XMLNS_NS, "bar", 0)).isEqualTo(12);
    org.assertj.core.api.Assertions.assertThat(parser.getAttributeUnsignedIntValue(org.robolectric.res.builder.XmlResourceParserImplTest.XMLNS_NS, "foo", 0)).isEqualTo(0);
    forgeAndOpenDocument("<foo xmlns:bar=\"-12\"/>");
    org.assertj.core.api.Assertions.assertThat(parser.getAttributeUnsignedIntValue(org.robolectric.res.builder.XmlResourceParserImplTest.XMLNS_NS, "bar", 0)).isEqualTo(0).as("Getting a negative number as unsigned should return the default value.");
}