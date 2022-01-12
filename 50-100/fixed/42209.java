public static BinaryTree.Node findCommonAncestor(final BinaryTree.Node a, final BinaryTree.Node b) {
    java.util.Set<BinaryTree.Node> parentsA = new java.util.HashSet<BinaryTree.Node>();
    BinaryTree.Node cursor = a;
    while (null != cursor) {
        parentsA.add(cursor);
        cursor = cursor.parent;
    } 
    cursor = b;
    BinaryTree.Node commonAncestor = null;
    while (null != cursor) {
        if (parentsA.contains(cursor)) {
            commonAncestor = cursor;
            break;
        }
        cursor = cursor.parent;
    } 
    return commonAncestor;
}