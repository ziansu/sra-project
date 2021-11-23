public static jace.app.SyntacticAnalysis.ParseTreeNode process() throws jace.app.SyntacticAnalysis.ParseException {
    jace.app.SyntacticAnalysis.ParseTreeNode root = new jace.app.SyntacticAnalysis.ParseTreeNode("Id", "");
    if ((jace.app.SyntacticAnalysis.SyntacticAnalyze.tokens.get(0).getType()) == (Token.Type.IDENTIFIER)) {
        jace.app.SyntacticAnalysis.SyntacticAnalyze.tokens.remove(0);
        root.addChild(new jace.app.SyntacticAnalysis.ParseTreeNode("IDENTIFIER", jace.app.SyntacticAnalysis.SyntacticAnalyze.tokens.get(0).getContent()));
    }else {
        throw new jace.app.SyntacticAnalysis.ParseException(jace.app.SyntacticAnalysis.SyntacticAnalyze.tokens.get(0).getContent());
    }
    return root;
}