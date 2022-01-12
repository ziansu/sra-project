@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (o == (this))
        return true;
    
    if (o == null)
        return false;
    
    if ((getClass()) != (o.getClass()))
        return false;
    
    spell.Trie.TrieNode other = ((spell.Trie.TrieNode) (o));
    if ((this.count) != (other.count))
        return false;
    
    return this.compareNode(other);
}