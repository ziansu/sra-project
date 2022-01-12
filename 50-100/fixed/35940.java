private static void enumLettersWithNode(org.trie4j.patricia.PatriciaTrieNode node, java.lang.String prefix, java.util.List<org.trie4j.util.Pair<java.lang.String, org.trie4j.patricia.PatriciaTrieNode>> letters) {
    for (org.trie4j.patricia.PatriciaTrieNode child : node.getChildren()) {
        java.lang.String text = prefix + (new java.lang.String(child.getLetters()));
        if (child.isTerminate())
            letters.add(org.trie4j.util.Pair.create(text, child));
        
        org.trie4j.patricia.PatriciaTrie.enumLettersWithNode(child, text, letters);
    }
}