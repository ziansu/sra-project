public void insert(java.lang.String word, java.lang.String classification, java.lang.String definition) {
    int key = hash1(word);
    int key2 = hash2(word);
    if ((numElements) >= ((tableSize) / 2)) {
        resize();
    }
    int doubledhash = (key + key2) % (tableSize);
    Dictionary.keyValue kvp = new Dictionary.keyValue(key, word, classification, definition);
    dhArray[doubledhash] = kvp;
    (numElements)++;
}