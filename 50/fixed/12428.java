@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void create_nullFile() throws java.lang.Exception {
    java.io.File file = null;
    new xyz.enhorse.commons.parameters.TextFileLoader(file, java.nio.charset.StandardCharsets.UTF_8);
}