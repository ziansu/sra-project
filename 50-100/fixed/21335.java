@org.junit.Test
public void testIsEmptyElementTag() throws java.lang.Exception {
    org.assertj.core.api.Assertions.assertThat(parser.isEmptyElementTag()).as("Before START_DOCUMENT should return false.").isEqualTo(false);
    forgeAndOpenDocument("<foo><bar/></foo>");
    org.assertj.core.api.Assertions.assertThat(parser.isEmptyElementTag()).as("Not empty tag should return false.").isEqualTo(false);
    forgeAndOpenDocument("<foo/>");
    org.assertj.core.api.Assertions.assertThat(parser.isEmptyElementTag()).as("In the Android implementation this method always return false.").isEqualTo(false);
}