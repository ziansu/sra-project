public java.lang.String max() {
    if (this.empty()) {
        return null;
    }
    WAVLTree.WAVLNode currNode = this.root;
    while (!(currNode.right.isExt())) {
        currNode = currNode.right;
    } 
    return currNode.info;
}