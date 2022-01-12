public static void writeDictionary(java.lang.String dictionaryLocation) throws java.io.IOException {
    java.util.HashMap<java.lang.String, java.lang.Object> dict = new java.util.HashMap<java.lang.String, java.lang.Object>();
    java.util.Scanner read = new java.util.Scanner(new java.io.FileReader(dictionaryLocation));
    while (read.hasNext()) {
        java.lang.String word = read.next();
        dict.put(word, null);
    } 
    SpellChecker.dictionary = dict;
}