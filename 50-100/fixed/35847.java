private boolean isRelevant(org.eclipse.jdt.core.dom.ASTNode node) {
    if (node == null) {
        return false;
    }
    int start = getStartLine(node);
    int end = getEndLine(node);
    if ((start <= (point.getLineNumber())) && ((point.getLineNumber()) <= end)) {
        return true;
    }
    return false;
}