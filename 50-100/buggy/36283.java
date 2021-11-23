public RBTree.RBNode findSccr(RBTree.RBNode node) {
    if ((node.rightT) != null) {
        node = node.getRight();
        while ((node.leftT) != null) {
            node = node.getRight();
        } 
        return node;
    }else {
        if ((node.parentT.getLeft()) == node) {
            return node.parentT;
        }else {
            while (node != (node.parentT.getLeft())) {
                node = node.parentT;
            } 
        }
        return node;
    }
}