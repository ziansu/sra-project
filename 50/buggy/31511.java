@org.junit.After
public void cleanUp() {
    assertTrue("The generated output file should be deleted", outputFile.delete());
}