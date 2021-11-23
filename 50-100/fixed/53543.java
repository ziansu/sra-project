public void removeSubtree(org.opendaylight.lispflowmapping.inmemorydb.radixtrie.RadixTrie<T>.TrieNode node) {
    org.opendaylight.lispflowmapping.inmemorydb.radixtrie.RadixTrie<T>.TrieNode itNode;
    java.util.Iterator<org.opendaylight.lispflowmapping.inmemorydb.radixtrie.RadixTrie<T>.TrieNode> it = node.iterator();
    while (it.hasNext()) {
        itNode = it.next();
        itNode.erase();
    } 
}