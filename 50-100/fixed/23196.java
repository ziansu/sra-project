@org.junit.Test
public void testGetAttributeCount() throws java.lang.Exception {
    org.assertj.core.api.Assertions.assertThat(parser.getAttributeCount()).as("When no node is being explored the number of attributes should be -1.").isEqualTo((-1));
    forgeAndOpenDocument("<foo bar=\"bar\"/>");
    org.assertj.core.api.Assertions.assertThat(parser.getAttributeCount()).isEqualTo(1);
}