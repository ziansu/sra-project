@storybook.test.importer.Test
public void testGetTokens_1() throws java.lang.Exception {
    storybook.importer.StanfordCharacterParser fixture = new storybook.importer.StanfordCharacterParser(new java.io.ByteArrayInputStream("".getBytes()), StanfordCharacterParser.Strictness.FIRSTLAST);
    fixture.is = new java.io.ByteArrayInputStream("".getBytes());
    java.util.List<java.lang.String> result = fixture.getTokens();
    assertNotNull(result);
}