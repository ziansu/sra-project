@org.junit.Test
public void testGetUsedOidAndIdentifiers() throws java.io.IOException, tiptoi_reveng.lexer.LexerException, tiptoi_reveng.parser.ParserException {
    reader.read(new java.io.File(getClass().getResource("/tip-toi-reveng/vokabeltrainer.yaml").getFile()));
    java.util.Map<java.lang.Integer, java.lang.String> result = reader.getUsedOidAndIdentifiers();
    assertEquals(6, result.size());
}