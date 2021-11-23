public boolean searchRecursive(Trie.TrieNode current, java.lang.String s, int index) {
    if (index == (s.length())) {
        return current.endOfWord;
    }
    char c = s.charAt(index);
    Trie.TrieNode node = current.children.get(c);
    if (node == null) {
        return false;
    }
    return searchRecursive(node, s, (index + 1));
}