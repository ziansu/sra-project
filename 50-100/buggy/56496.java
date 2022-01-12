private int containsWords(java.lang.String[] words, boolean contains) {
    int counter = 0;
    for (java.lang.String word : words) {
        boolean result = this.contains(word);
        if (result != contains) {
            counter++;
        }
    }
    return counter;
}