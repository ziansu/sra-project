public void addLine(java.lang.String line, int frequency) {
    task.SuffixTreeDictionary.SuffixNode currentNode = root;
    for (int i = 0; i < (line.length()); i++) {
        char c = line.charAt(i);
        currentNode = currentNode.addChild(c, frequency);
    }
    currentNode.setLastNode(frequency);
}