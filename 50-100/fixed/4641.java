public static void loadWordTable(java.util.ArrayList<java.lang.String> words) {
    entities.WordTable.table = new java.util.Hashtable<java.lang.String, java.lang.Boolean>();
    int numWords = words.size();
    for (int i = 0; i < numWords; i++) {
        java.lang.String word = words.get(i);
        word = word.trim();
        word = word.toLowerCase();
        entities.WordTable.table.put(word, java.lang.Boolean.TRUE);
    }
}