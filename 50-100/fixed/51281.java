private void errorMessage(org.eclipse.golo.compiler.GoloCompilationException.Problem.Type type, org.eclipse.golo.compiler.parser.GoloASTNode node, java.lang.String message) {
    org.eclipse.golo.compiler.PositionInSourceCode position = null;
    if (node != null) {
        position = node.getPositionInSourceCode();
    }
    java.lang.String errorMessage = ((message + ' ') + (position != null ? gololang.Messages.message("source_position", position.getLine(), position.getColumn()) : gololang.Messages.message("generated_code"))) + ".";
    getExceptionBuilder().report(type, node, errorMessage);
}