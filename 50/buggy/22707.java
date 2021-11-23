@org.junit.Test
public void pathname_existingDirectory() throws java.lang.Exception {
    assertEquals(existingDirectory(), new xyz.enhorse.commons.HandyPath(existingDirectory()).pathname());
}