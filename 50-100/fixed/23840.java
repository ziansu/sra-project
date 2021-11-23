public static Loader load(java.io.InputStream is) {
    org.antlr.v4.runtime.ANTLRInputStream input;
    try {
        input = new org.antlr.v4.runtime.ANTLRInputStream(is);
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
    AsmLexer lexer = new AsmLexer(input);
    org.antlr.v4.runtime.CommonTokenStream tokens = new org.antlr.v4.runtime.CommonTokenStream(lexer);
    AsmParser parser = new AsmParser(tokens);
    org.antlr.v4.runtime.tree.ParseTree tree = parser.program();
    Loader loader = new Loader();
    loader.visit(tree);
    return loader;
}