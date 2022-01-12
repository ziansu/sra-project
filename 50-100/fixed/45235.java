@org.junit.Test
public void runGenerator() throws java.io.IOException, java.net.URISyntaxException {
    java.io.File spec1 = new java.io.File("src/test/resources", "spec1.yml");
    java.io.File spec2 = new java.io.File("src/test/resources", "spec2.yml");
    java.io.File spec3 = new java.io.File("src/test/resources", "spec3.yml");
    java.io.File outputDir = new java.io.File("build/output");
    org.apache.commons.io.FileUtils.deleteDirectory(outputDir);
    outputDir.mkdirs();
    com.github.slamdev.swagger.SwaggerGeneratorTest.GENERATOR.generate(java.util.Arrays.asList(spec1, spec2, spec3), outputDir, "com.test", "super", "foo", false);
}