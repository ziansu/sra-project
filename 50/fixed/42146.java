@org.junit.Before
public void setUp() throws java.lang.Exception {
    testHomeDir = java.nio.file.Paths.get("target", "test-home");
    storagePath = testHomeDir.resolve(".wl-lib-demo").resolve("storage.properties");
    java.nio.file.Files.deleteIfExists(storagePath);
}