private static void parse(@org.antlr.v4.runtime.misc.NotNull
InputParserLexer lexer) {
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    InputParserParser parser = new InputParserParser(tokens);
    InputParserParser.ParseContext tree = parser.parse();
    ExtendedVisitor visitor = new ExtendedVisitor();
    java.lang.System.out.println(tree.toStringTree());
    visitor.visit(tree);
    java.lang.System.out.println(tree.toString());
}