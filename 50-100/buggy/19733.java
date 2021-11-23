public static com.github.tmatek.zhangshasha.StringTreeNode randomTree(int maxDepth, int maxChildren) {
    java.util.Random r = new java.util.Random();
    com.github.tmatek.zhangshasha.StringTreeNode root = new com.github.tmatek.zhangshasha.StringTreeNode((((char) ((r.nextInt(26)) + 'a')) + ""));
    com.github.tmatek.zhangshasha.StringTreeNode.randomTreeRec(root, 1, maxDepth, maxChildren, r);
    return root;
}