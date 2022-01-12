private net.networkdowntime.search.trie.SuffixTrieNode findLastNode(java.lang.String word) {
    net.networkdowntime.search.trie.SuffixTrieNode currentNode = this;
    int i = 0;
    while (i < (word.length())) {
        char c = word.charAt(i);
        if ((currentNode.children) != null) {
            currentNode = currentNode.children.get(c);
        }
        i++;
    } 
    return currentNode;
}