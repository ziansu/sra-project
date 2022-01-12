public org.apache.mesos.hdfs.util.Trie<K, M> addChild(org.apache.mesos.hdfs.util.Trie<K, M> node) {
    node.parent = this;
    if (children.containsKey(key)) {
        children.get(node.getKey()).setModel(node.getModel());
        node = children.get(node.getKey());
    }else {
        children.put(node.getKey(), node);
    }
    return node;
}