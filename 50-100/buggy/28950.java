void replaceSol2(int[] arr) {
    com.mounacheikhna.practice.tree.bst.ReplaceWithLeastGreaterRight.BtNode root = null;
    com.mounacheikhna.practice.tree.bst.ReplaceWithLeastGreaterRight.BtNode succ = null;
    for (int i = (arr.length) - 1; i >= 0; i--) {
        final javafx.util.Pair<com.mounacheikhna.practice.tree.bst.ReplaceWithLeastGreaterRight.BtNode, com.mounacheikhna.practice.tree.bst.ReplaceWithLeastGreaterRight.BtNode> p = insert(root, arr[i], succ);
        root = p.getKey();
        succ = p.getValue();
        arr[i] = (succ != null) ? succ.data : -1;
    }
}