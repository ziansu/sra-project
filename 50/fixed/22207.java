public void insert(int i) {
    awesomeRB.RBTree.RBNode newNode = new awesomeRB.RBTree.RBNode(i);
    if (empty()) {
        setRoot(newNode);
    }else {
        redBlackInsert(newNode);
    }
    (this.size)++;
}