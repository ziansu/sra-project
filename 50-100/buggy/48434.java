private void getAll(TrieNode node, java.util.Map<java.lang.Character, TrieNode> children, java.util.List<java.lang.Integer> results) {
    if ((node.getRoadId()) > 0) {
        results.add(node.getRoadId());
    }
    if ((node.getChildren()) != null) {
        for (TrieNode child : children.values()) {
            getAll(child, child.getChildren(), results);
        }
    }
}