@java.lang.Override
public void visitNode(com.sonar.sslr.api.AstNode astNode) {
    com.sonar.sslr.api.AstNode colon = astNode.getFirstChild(JsonGrammar.COLON);
    com.sonar.sslr.api.AstNode name = colon.getPreviousAstNode();
    com.sonar.sslr.api.AstNode value = colon.getNextAstNode().getNextAstNode();
    com.sonar.sslr.api.AstNode stringValue = value.getFirstChild(JsonGrammar.STRING);
    if (stringValue != null) {
        if (extractString(name).equals(extractString(stringValue))) {
            getContext().createLineViolation(this, "Wrong!", astNode);
        }
    }
}