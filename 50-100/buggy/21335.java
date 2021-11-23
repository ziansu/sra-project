@org.junit.Test
public void testIsEmptyElementTag() throws java.lang.Exception {
    org.assertj.core.api.Assertions.assertThat(parser.isEmptyElementTag()).isEqualTo(false).as("Before START_DOCUMENT should return false.");
    forgeAndOpenDocument("<foo><bar/></foo>");
    org.assertj.core.api.Assertions.assertThat(parser.isEmptyElementTag()).isEqualTo(false).as("Not empty tag should return false.");
    forgeAndOpenDocument("<foo/>");
    org.assertj.core.api.Assertions.assertThat(parser.isEmptyElementTag()).isEqualTo(false).as("In the Android implementation this method always return false.");
}