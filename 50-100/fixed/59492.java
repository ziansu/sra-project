private java.util.List<java.lang.String> getCompletionsInternal(java.lang.String prefix) {
    java.util.List<java.lang.String> completions = new java.util.ArrayList<java.lang.String>();
    if (this.isEnd) {
        completions.add(prefix);
    }
    if ((children) != null) {
        for (java.lang.Object obj : children.values()) {
            net.networkdowntime.search.trie.SuffixTrieNode child = ((net.networkdowntime.search.trie.SuffixTrieNode) (obj));
            completions.addAll(child.getCompletionsInternal((prefix + (child.suffix))));
        }
    }
    return completions;
}