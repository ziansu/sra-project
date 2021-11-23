public void add(java.lang.String input) {
    io.inbot.utils.SimpleStringTrie.TrieNode currentNode = root;
    for (char c : input.toCharArray()) {
        java.util.Map<java.lang.Character, io.inbot.utils.SimpleStringTrie.TrieNode> children = currentNode.getChildren();
        io.inbot.utils.SimpleStringTrie.TrieNode matchingNode = children.get(c);
        if (matchingNode != null) {
            currentNode = matchingNode;
        }else {
            io.inbot.utils.SimpleStringTrie.TrieNode newNode = new io.inbot.utils.SimpleStringTrie.TrieNode(c);
            children.put(c, newNode);
            currentNode = newNode;
        }
    }
    currentNode.end = true;
}