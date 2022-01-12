public static void main(java.lang.String[] args) throws java.lang.Exception {
    ANTLRInputStream input = new ANTLRFileStream("if.java");
    JavaLexer lexer = new JavaLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    JavaParser parser = new JavaParser(tokens);
    ParseTree tree = parser.compilationUnit();
    CFGParserVisitor visitor = new CFGParserVisitor(parser);
    visitor.visit(tree);
    CFGParserVisitor.linkNodes();
    CFGParserVisitor.printNodes();
}