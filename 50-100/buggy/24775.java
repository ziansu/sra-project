@java.lang.Override
public void visitNode(com.sonar.sslr.api.AstNode node) {
    if (((isHeader(getContext().getFile().getName())) && (node.getTokenValue().equals("using"))) && (node.getFirstChild().getChildren().toString().contains("namespace"))) {
        getContext().createLineViolation(this, "Using namespace are not allowed in header files.", node);
    }
}