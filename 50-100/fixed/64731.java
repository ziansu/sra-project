public void removeSubtree(byte[] prefix, int preflen) {
    org.opendaylight.lispflowmapping.inmemorydb.radixtrie.RadixTrie<T>.TrieNode itNode = lookupBest(prefix, preflen);
    if (itNode == null) {
        return ;
    }
    java.util.Iterator<org.opendaylight.lispflowmapping.inmemorydb.radixtrie.RadixTrie<T>.TrieNode> it = itNode.iterator();
    while (it.hasNext()) {
        itNode = it.next();
        itNode.erase();
    } 
}