public void removeSubtree(byte[] prefix, int preflen) {
    org.opendaylight.lispflowmapping.inmemorydb.radixtrie.RadixTrie<T>.TrieNode itNode;
    java.util.Iterator<org.opendaylight.lispflowmapping.inmemorydb.radixtrie.RadixTrie<T>.TrieNode> it;
    itNode = lookupBest(prefix, preflen);
    if (itNode == null) {
        return ;
    }
    it = itNode.iterator();
    while (it.hasNext()) {
        itNode = it.next();
        itNode.erase();
    } 
}