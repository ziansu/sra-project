@java.lang.Override
public void update(java.lang.String word, int weight) {
    this.toInsertWeight = weight;
    wasEndWord = false;
    root = recursiveInsert(root, word);
}