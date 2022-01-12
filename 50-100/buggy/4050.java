private static com.puppycrawl.tools.checkstyle.api.DetailAST getFirstChildTokenOfType(com.puppycrawl.tools.checkstyle.api.DetailAST rootToken, int tokenType) {
    com.puppycrawl.tools.checkstyle.api.DetailAST resultNode = null;
    com.puppycrawl.tools.checkstyle.api.DetailAST currentNode = rootToken.getFirstChild();
    while (currentNode != null) {
        if ((currentNode.getType()) == tokenType) {
            resultNode = currentNode;
            break;
        }
        com.puppycrawl.tools.checkstyle.api.DetailAST childNode = com.github.sevntu.checkstyle.checks.coding.DiamondOperatorForVariableDefinitionCheck.getFirstChildTokenOfType(currentNode, tokenType);
        if (childNode == null) {
            currentNode = currentNode.getNextSibling();
        }else {
            resultNode = childNode;
            break;
        }
    } 
    return resultNode;
}