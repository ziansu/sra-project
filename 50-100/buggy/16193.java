@org.testng.annotations.Test
public void testAddMultipleFiles() throws java.io.IOException {
    java.io.File baseDir = new java.io.File(java.lang.Thread.currentThread().getContextClassLoader().getResource("testAddMultipleFiles").getFile());
    com.github.dockerjava.core.dockerfile.Dockerfile dockerfile = new com.github.dockerjava.core.dockerfile.Dockerfile(new java.io.File(baseDir, "Dockerfile"));
    com.github.dockerjava.core.dockerfile.Dockerfile.ScannedResult result = dockerfile.parse();
    java.util.Collection<java.lang.String> filesToAdd = com.google.common.collect.Collections2.transform(result.filesToAdd, com.github.dockerjava.core.dockerfile.DockerfileAddMultipleFilesTest.TO_FILE_NAMES);
    org.hamcrest.MatcherAssert.assertThat(filesToAdd, org.hamcrest.Matchers.containsInAnyOrder("Dockerfile", "src1", "src2"));
}