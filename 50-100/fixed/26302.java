public boolean isPresent(java.lang.String word) {
    if ((word == null) || (word.trim().isEmpty()))
        return false;
    
    datastructures.prefixTree.PrefixTree.Node current = root;
    for (char ch : word.trim().toUpperCase().toCharArray()) {
        if (current.children.containsKey(ch))
            current = current.children.get(ch);
        else
            return false;
        
    }
    return current.isWord;
}