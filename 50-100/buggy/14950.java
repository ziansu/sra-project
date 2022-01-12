private boolean recipientExistInTree(java.lang.String recipient, com.tle.web.recipientselector.tree.SelectionGroupingTreeNode rootNode) {
    for (com.tle.web.recipientselector.tree.SelectionExpressionTreeNode expression : rootNode.getSelection()) {
        if (expression.getExpression().equals(recipient)) {
            return true;
        }
    }
    for (com.tle.web.recipientselector.tree.SelectionGroupingTreeNode group : rootNode.getChildren()) {
        java.lang.Boolean find = recipientExistInTree(recipient, group);
        if (find != null) {
            return find;
        }
    }
    return false;
}