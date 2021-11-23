public int occurrence_count(components.Window w) {
    int occurrences = 0;
    occurrences = trie.occurrence_count(encode(w));
    return occurrences;
}