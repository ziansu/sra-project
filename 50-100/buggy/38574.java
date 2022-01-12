@org.junit.Test
public void testImproperFileExtension() throws java.lang.Exception {
    final com.puppycrawl.tools.checkstyle.DefaultConfiguration checkConfig = createCheckConfig(com.puppycrawl.tools.checkstyle.checks.naming.ConstantNameCheck.class);
    final java.io.File file = temporaryFolder.newFile("file.pdf");
    final java.lang.String content = "public class Main { public static final int k = 5 + 4; }";
    try (final java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), java.nio.charset.StandardCharsets.UTF_8))) {
        writer.write(content);
    }
    final java.lang.String[] expected = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
    verify(checkConfig, file.getPath(), expected);
}