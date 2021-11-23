@org.junit.Test
public void import3() throws cop5555sp15.SimpleParser.SyntaxException {
    java.lang.System.out.println("import2");
    java.lang.String input = "import class A { } ";
    java.lang.System.out.println(input);
    cop5555sp15.TokenStream.Kind ExpectedIncorrectTokenKind = KW_CLASS;
    parseIncorrectInput(input, ExpectedIncorrectTokenKind);
}