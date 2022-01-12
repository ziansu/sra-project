@org.junit.Before
public void setUp() throws java.io.IOException {
    java.nio.file.Path workingPath = java.nio.file.Paths.get(workingDirectory);
    java.nio.file.Files.createDirectories(workingPath);
    java.nio.file.Files.walk(workingPath, java.nio.file.FileVisitOption.FOLLOW_LINKS).map(java.nio.file.Path::toFile).forEach(java.io.File::delete);
    org.springframework.test.util.ReflectionTestUtils.setField(resourceRepository, "WORKING_DIRECTORY", workingPath);
}