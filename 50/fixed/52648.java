public ru.spbau.mit.cursors.Index.BTree.Node getChild(int index) throws java.io.IOException {
    if ((getChildPageAt(index)) == null) {
        return null;
    }
    return getNode(getChildPageAt(index));
}