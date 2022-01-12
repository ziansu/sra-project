@org.junit.Test
public void testGetAttributeUnsignedIntValue_IntInt() throws java.lang.Exception {
    forgeAndOpenDocument("<foo bar=\"12\"/>");
    org.assertj.core.api.Assertions.assertThat(parser.getAttributeUnsignedIntValue(0, 0)).isEqualTo(12);
    org.assertj.core.api.Assertions.assertThat(parser.getAttributeUnsignedIntValue(attributeIndexOutOfIndex(), 0)).isEqualTo(0);
    forgeAndOpenDocument("<foo bar=\"-12\"/>");
    org.assertj.core.api.Assertions.assertThat(parser.getAttributeUnsignedIntValue(0, 0)).as("Getting a negative number as unsigned should return the default value.").isEqualTo(0);
}