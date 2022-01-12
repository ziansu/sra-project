public boolean search(java.lang.String word) {
    TrieNode root = searchNode(word);
    if ((root != null) && (root.isLeaf)) {
        return true;
    }
    return false;
}