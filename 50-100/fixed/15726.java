private void parseIncorrectInput(java.lang.String input, cop5555sp15.TokenStream.Kind ExpectedIncorrectTokenKind) {
    cop5555sp15.TokenStream stream = new cop5555sp15.TokenStream(input);
    cop5555sp15.Scanner scanner = new cop5555sp15.Scanner(stream);
    scanner.scan();
    cop5555sp15.SimpleParser parser = new cop5555sp15.SimpleParser(stream);
    try {
        parser.parse();
        fail();
    } catch (cop5555sp15.SimpleParser.SyntaxException e) {
        assertEquals(ExpectedIncorrectTokenKind, e.t.kind);
    }
}