public void add(java.lang.String word) {
    int output = root.add(word.toLowerCase());
    if (output > 0)
        (word_count)++;
    
    node_count += output;
}