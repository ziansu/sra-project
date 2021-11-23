public org.opendaylight.lispflowmapping.inmemorydb.radixtrie.RadixTrie<T>.TrieNode parentWithBitLessThan(int bitlen) {
    org.opendaylight.lispflowmapping.inmemorydb.radixtrie.RadixTrie<T>.TrieNode node;
    org.opendaylight.lispflowmapping.inmemorydb.radixtrie.RadixTrie<T>.TrieNode parent;
    node = this;
    parent = node.up;
    while ((parent != null) && ((parent.bit) >= bitlen)) {
        node = parent;
        parent = node.up;
    } 
    return node;
}