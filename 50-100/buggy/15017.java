public boolean remove(java.lang.String element) {
    if (!(contains(element))) {
        return false;
    }
    ru.spbau.mit.java.karvozavr.Trie.Node node = root;
    for (char c : element.toCharArray()) {
        (node.startsWithThisPrefix)--;
        if ((node.getChild(c).startsWithThisPrefix) <= 1) {
            node.removeChild(c);
            return true;
        }
        node = node.getChild(c);
    }
    node.isTerminating = false;
    (size)--;
    return true;
}