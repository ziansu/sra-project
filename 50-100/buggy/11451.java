public void remove(double v) {
    if ((root) != null) {
        if ((root.getValue()) == v) {
            BTree.Node tempRoot = new BTree.Node(0);
            tempRoot.setLeft(root);
            root.removeNode(v, tempRoot);
            root = tempRoot.getLeft();
        }else {
            root.removeNode(v, null);
        }
        size -= 1;
    }
}