@java.lang.Override
public void visitNode(com.sonar.sslr.api.AstNode node) {
    if (((isHeader(getContext().getFile().getName())) && ("using".equals(node.getTokenValue()))) && (node.getFirstChild().getChildren().toString().contains("namespace"))) {
        getContext().createLineViolation(this, "Using namespace are not allowed in header files.", node);
    }
}