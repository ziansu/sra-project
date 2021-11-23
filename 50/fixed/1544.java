public int occurrence_count(components.Window w) {
    int occurrences = trie.occurrence_count(encode(w));
    return occurrences;
}