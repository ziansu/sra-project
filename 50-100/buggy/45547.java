@org.junit.Test
public void testProperFileExtension() throws java.lang.Exception {
    final com.puppycrawl.tools.checkstyle.DefaultConfiguration checkConfig = createCheckConfig(com.puppycrawl.tools.checkstyle.checks.naming.ConstantNameCheck.class);
    final java.lang.String content = "public class Main { public static final int k = 5 + 4; }";
    final java.io.File file = temporaryFolder.newFile("file.java");
    try (final java.io.Writer writer = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), java.nio.charset.StandardCharsets.UTF_8))) {
        writer.write(content);
    }
    final java.lang.String[] expected1 = new java.lang.String[]{ "1:45: Name 'k' must match pattern '^[A-Z][A-Z0-9]*(_[A-Z0-9]+)*$'." };
    verify(checkConfig, file.getPath(), expected1);
}