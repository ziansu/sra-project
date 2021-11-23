protected com.songfamily.tiem.MyBinaryTreeNode insert(int i, com.songfamily.tiem.MyBinaryTreeNode node) {
    if (node == null) {
        node = new com.songfamily.tiem.MyBinaryTreeNode(i);
    }else {
        if (i <= (node.getPayload()))
            node.setLeftChild(insert(i, node.getLeftChild()));
        else
            node.setRightChild(insert(i, node.getRightChild()));
        
    }
    return node;
}