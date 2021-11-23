private static void retrieveValue(java.util.HashMap<com.unnamed.b.atv.model.TreeNode, java.lang.String> treeNodeHashMap, com.unnamed.b.atv.model.TreeNode node, java.util.ArrayList<java.lang.String> value, java.util.ArrayList<java.lang.String> name) {
    if ((node.getParent()) != null) {
        value.add(com.vijay.jsonwizard.customviews.TreeViewDialog.getTreeNodeKey(treeNodeHashMap, node));
        name.add(((java.lang.String) (node.getValue())));
        com.vijay.jsonwizard.customviews.TreeViewDialog.retrieveValue(treeNodeHashMap, node.getParent(), value, name);
    }
}