public static jace.app.SyntacticAnalysis.ParseTreeNode process() throws jace.app.SyntacticAnalysis.ParseException {
    jace.app.SyntacticAnalysis.ParseTreeNode root;
    if ((jace.app.SyntacticAnalysis.SyntacticAnalyze.tokens.get(0).getType()) == (Token.Type.IDENTIFIER)) {
        root = new jace.app.SyntacticAnalysis.ParseTreeNode("IDENTIFIER", jace.app.SyntacticAnalysis.SyntacticAnalyze.tokens.get(0).getContent());
        jace.app.SyntacticAnalysis.SyntacticAnalyze.tokens.remove(0);
    }else {
        throw new jace.app.SyntacticAnalysis.ParseException(jace.app.SyntacticAnalysis.SyntacticAnalyze.tokens.get(0).getContent());
    }
    return root;
}