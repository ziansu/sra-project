task.SuffixTreeDictionary.SuffixNode addChild(java.lang.Character key, int frequency) {
    if (key == null) {
        throw new java.lang.IllegalArgumentException("Null values are not supported in Suffix Tree");
    }
    task.SuffixTreeDictionary.SuffixNode child;
    if (!(children.containsKey(key))) {
        child = new task.SuffixTreeDictionary.SuffixNode(frequency);
        children.put(key, child);
    }else {
        child = children.get(key);
        child.weight += frequency;
    }
    updateMostFrequent(key, child);
    return child;
}