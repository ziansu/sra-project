private static jace.app.SyntacticAnalysis.ParseTreeNode analyze(java.lang.String code) {
    jace.app.SyntacticAnalysis.SyntacticAnalyze.tokens = new jace.app.Tokenizer.Tokenizer(code).tokenize();
    jace.app.SyntacticAnalysis.ParseTreeNode root = new jace.app.SyntacticAnalysis.ParseTreeNode("", "");
    try {
        root = jace.app.SyntacticAnalysis.SyntacticAnalyze.Program.process();
    } catch (jace.app.SyntacticAnalysis.ParseException e) {
        java.lang.System.out.println(e.getMessage());
        java.lang.System.exit((-1));
    }
    return root;
}