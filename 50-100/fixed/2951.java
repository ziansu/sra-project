public lobstre.chtrie.ConcurrentHashTrieMap.CNode<K, V> removed(final lobstre.chtrie.ConcurrentHashTrieMap.FlagPos flagPos) {
    final lobstre.chtrie.ConcurrentHashTrieMap.BranchNode[] narr = lobstre.chtrie.ConcurrentHashTrieMap.removed(lobstre.chtrie.ConcurrentHashTrieMap.BranchNode.class, this.array, flagPos.position);
    return new lobstre.chtrie.ConcurrentHashTrieMap.CNode<K, V>(narr, ((this.bitmap) ^ (flagPos.flag)));
}