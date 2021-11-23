private boolean isEndOfScope(final com.puppycrawl.tools.checkstyle.api.DetailAST lastAnnotationNode, final com.puppycrawl.tools.checkstyle.api.DetailAST node) {
    com.puppycrawl.tools.checkstyle.api.DetailAST checkNode = node;
    while (!(checkNode.equals(lastAnnotationNode))) {
        switch (checkNode.getType()) {
            case com.puppycrawl.tools.checkstyle.api.TokenTypes.RCURLY :
            case com.puppycrawl.tools.checkstyle.api.TokenTypes.RBRACK :
                while ((checkNode.getNextSibling()) == null) {
                    checkNode = checkNode.getParent();
                } 
                checkNode = checkNode.getNextSibling();
                break;
            default :
                return false;
        }
    } 
    return true;
}