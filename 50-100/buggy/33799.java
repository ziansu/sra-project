public static com.yahoo.sql4d.Program compileSql(java.lang.String query) {
    try {
        org.antlr.runtime.ANTLRStringStream in = new org.antlr.runtime.ANTLRStringStream(query);
        com.yahoo.sql4d.converter.druidGLexer lexer = new com.yahoo.sql4d.converter.druidGLexer(in);
        org.antlr.runtime.CommonTokenStream tokens = new org.antlr.runtime.CommonTokenStream(lexer);
        com.yahoo.sql4d.converter.druidGParser parser = new com.yahoo.sql4d.converter.druidGParser(tokens);
        com.yahoo.sql4d.Program pgm = parser.program();
        return pgm;
    } catch (org.antlr.runtime.RecognitionException ex) {
        java.util.logging.Logger.getLogger(com.yahoo.sql4d.DCompiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    return null;
}