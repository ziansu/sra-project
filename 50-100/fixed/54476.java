@java.lang.SuppressWarnings(value = "unchecked")
public indexingTopology.util.BTreeLeafNode<TKey, TValue> findLeafNodeShouldContainKeyInTemplate(TKey key) {
    indexingTopology.util.BTreeNode<TKey> currentNode = this.root;
    while ((currentNode.getNodeType()) == (TreeNodeType.InnerNode)) {
        indexingTopology.util.BTreeNode<TKey> node = ((indexingTopology.util.BTreeInnerNode<TKey>) (currentNode)).getChild(currentNode.search(key));
        currentNode = node;
    } 
    return ((indexingTopology.util.BTreeLeafNode<TKey, TValue>) (currentNode));
}