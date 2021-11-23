@org.testng.annotations.Test(dataProvider = "d02")
public void testLevelOrderTraversalV2(com.albion.common.tree.node.BinarySearchTreeNode<java.lang.Integer> root) {
    com.albion.common.tree.BinaryTreePrinter.printNode(root);
    com.albion.common.search.bst.LevelOrderTraversal<java.lang.Integer> trv = new com.albion.common.search.bst.LevelOrderTraversal(root);
    java.util.List<java.util.List<java.lang.Integer>> lists = trv.makeLevelOrderTree(root, true);
    for (java.util.List<java.lang.Integer> list : lists) {
        for (java.lang.Integer i : list) {
            java.lang.System.out.print(((" [" + i) + "]"));
        }
        java.lang.System.out.println("");
    }
}