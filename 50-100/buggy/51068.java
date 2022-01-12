public int successor_count(java.util.List<components.Touch> successor_list, components.Window window, components.Touch touch) {
    int count2 = 0;
    java.util.List<java.lang.Integer> index_list = trie.get_index_list(encode(window));
    for (int i = 0; i < (index_list.size()); i++) {
        if (successor_list.get(index_list.get(i)).compare_with_token(tokens, touch)) {
            count2++;
        }
    }
    return count2;
}