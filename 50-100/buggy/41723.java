public void removeChild(char c) {
    if ((children[prep.datastructures.trie.Trie.charToIndex(c)]) != null)
        throw new java.lang.RuntimeException((("No child for char '" + c) + "'"));
    
    children[prep.datastructures.trie.Trie.charToIndex(c)] = null;
    (numChildren)--;
}