private WAVLTree.WAVLNode getSuccessor(WAVLTree.WAVLNode WAVL_Node) {
    if ((WAVL_Node.rightNode) != (WAVL_emptyNode)) {
        WAVL_Node = WAVL_Node.rightNode;
        while ((WAVL_Node.leftNode) != (WAVL_emptyNode)) {
            WAVL_Node = WAVL_Node.leftNode;
        } 
    }else {
        while (((WAVL_Node.parentNode) != null) && (WAVL_Node == (WAVL_Node.parentNode.rightNode))) {
            WAVL_Node = WAVL_Node.parentNode;
        } 
    }
    return WAVL_Node;
}