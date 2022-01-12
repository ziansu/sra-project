public void add(java.lang.String word) {
    int[] output = root.add(word.toLowerCase());
    word_count += output[1];
    node_count += output[0];
}