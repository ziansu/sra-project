@storybook.test.importer.Test
public void testStanfordCharacterParser_2() throws java.lang.Exception {
    java.io.InputStream in = new java.io.ByteArrayInputStream("".getBytes());
    storybook.importer.StanfordCharacterParser result = new storybook.importer.StanfordCharacterParser(in);
    assertNotNull(result);
}