private static void parse(@org.antlr.v4.runtime.misc.NotNull
InputParserLexer lexer) {
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    InputParserParser parser = new InputParserParser(tokens);
    InputParserParser.ParseContext tree = parser.parse();
    ExtendedVisitor visitor = new ExtendedVisitor();
    visitor.visit(tree);
}