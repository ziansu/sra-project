public static void printRightBoundary(com.srinu.traversals.Node node, com.srinu.traversals.Node root) {
    if (node != null) {
        if ((node.right) != null) {
            com.srinu.traversals.BoundaryTraversal_Btree.printRightBoundary(node.right, root);
            if (node != root)
                java.lang.System.out.print(((node.data) + " "));
            
        }else
            if ((node.left) != null) {
                com.srinu.traversals.BoundaryTraversal_Btree.printRightBoundary(node.left, root);
                java.lang.System.out.print(((node.data) + " "));
            }
        
    }
}