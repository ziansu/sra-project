@org.junit.Test
public void generateRelativeResourcePathShouldNotContainFirstSlash() {
    final java.lang.String pathname = "/home/target/some_folder/";
    final java.lang.String resourceRelativePath = "resource/toto.lst";
    final java.lang.String generatedRelativeResourcePath = processAPI.generateRelativeResourcePath(new java.io.File(pathname), new java.io.File(((pathname + (java.io.File.separator)) + resourceRelativePath)));
    org.assertj.core.api.Assertions.assertThat(generatedRelativeResourcePath).isEqualTo(resourceRelativePath);
}