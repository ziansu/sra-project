public static <E> java.lang.String serialize(org.offer.utils.node.BinaryTreeNode<E> root) {
    if (null == root) {
        return null;
    }
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    org.offer.case62.SerializeBinaryTree.a(root, builder);
    builder.deleteCharAt(builder.lastIndexOf(","));
    return builder.toString();
}