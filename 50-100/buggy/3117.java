private static eu.modelwriter.core.alloyinecore.structure.instance.Instance parseInstanceString(java.lang.String text, org.eclipse.emf.common.util.URI uri, org.antlr.v4.runtime.BaseErrorListener baseErrorListener) {
    final eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreLexer lexer = new eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreLexer(new org.antlr.v4.runtime.ANTLRInputStream(text));
    final org.antlr.v4.runtime.CommonTokenStream tokens = new org.antlr.v4.runtime.CommonTokenStream(lexer);
    final eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser parser = new eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser(tokens);
    parser.removeErrorListeners();
    parser.addErrorListener(baseErrorListener);
    parser.instance(null);
    return parser.instance;
}