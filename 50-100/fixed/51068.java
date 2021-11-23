public int successor_count(java.util.List<components.Touch> successor_list, components.Window window, components.Touch touch) {
    java.util.List<java.lang.Integer> index_list = trie.get_index_list(encode(window));
    int count2 = 0;
    for (int i = 0; i < (index_list.size()); i++) {
        if (successor_list.get(index_list.get(i)).compare_with_token(tokens, touch)) {
            count2++;
        }
    }
    return count2;
}