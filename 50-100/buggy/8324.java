private int addChildNodes(tellh.com.recyclertreeview_lib.TreeNode pNode, int startIndex) {
    java.util.List<tellh.com.recyclertreeview_lib.TreeNode> childList = pNode.getChildList();
    int addChildCount = 0;
    for (tellh.com.recyclertreeview_lib.TreeNode treeNode : childList) {
        displayNodes.add((startIndex + (addChildCount++)), treeNode);
        if (treeNode.isExpand()) {
            addChildCount += addChildNodes(treeNode, (startIndex + addChildCount));
        }
    }
    pNode.toggle();
    return addChildCount;
}