public com.unnamed.b.atv.model.TreeNode createTree(java.util.List<hu.bme.simonyi.acstudio.analogchaosinventoryapp.database.Item> items) {
    com.unnamed.b.atv.model.TreeNode root = com.unnamed.b.atv.model.TreeNode.root();
    for (hu.bme.simonyi.acstudio.analogchaosinventoryapp.database.Item item : items) {
        attachAvailableChildren(root, item, 0);
    }
    return root;
}