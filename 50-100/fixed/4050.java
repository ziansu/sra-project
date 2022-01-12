private static com.puppycrawl.tools.checkstyle.api.DetailAST getFirstChildTokenOfType(com.puppycrawl.tools.checkstyle.api.DetailAST rootToken, int tokenType) {
    com.puppycrawl.tools.checkstyle.api.DetailAST resultNode = rootToken.getFirstChild();
    if ((resultNode != null) && ((resultNode.getType()) != tokenType)) {
        com.puppycrawl.tools.checkstyle.api.DetailAST childNode = com.github.sevntu.checkstyle.checks.coding.DiamondOperatorForVariableDefinitionCheck.getFirstChildTokenOfType(resultNode, tokenType);
        if (childNode == null) {
            resultNode = resultNode.getNextSibling();
        }
    }
    return resultNode;
}