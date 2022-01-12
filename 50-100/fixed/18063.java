public static void printRightBoundary(com.srinu.traversals.Node node) {
    if (node != null) {
        if ((node.right) != null) {
            com.srinu.traversals.BoundaryTraversal_Btree.printRightBoundary(node.right);
            java.lang.System.out.print(((node.data) + " "));
        }else
            if ((node.left) != null) {
                com.srinu.traversals.BoundaryTraversal_Btree.printRightBoundary(node.left);
                java.lang.System.out.print(((node.data) + " "));
            }
        
    }
}