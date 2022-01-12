private boolean recipientExistInTree(java.lang.String recipient, com.tle.web.recipientselector.tree.SelectionGroupingTreeNode rootNode) {
    for (com.tle.web.recipientselector.tree.SelectionExpressionTreeNode expression : rootNode.getSelection()) {
        if (expression.getExpression().equals(recipient)) {
            return true;
        }
    }
    for (com.tle.web.recipientselector.tree.SelectionGroupingTreeNode group : rootNode.getChildren()) {
        return recipientExistInTree(recipient, group);
    }
    return false;
}