private void parseCorrectInput(java.lang.String input) throws cop5555sp15.SimpleParser.SyntaxException {
    cop5555sp15.TokenStream stream = new cop5555sp15.TokenStream(input);
    cop5555sp15.Scanner scanner = new cop5555sp15.Scanner(stream);
    scanner.scan();
    java.lang.System.out.println(stream);
    cop5555sp15.SimpleParser parser = new cop5555sp15.SimpleParser(stream);
    parser.parse();
}