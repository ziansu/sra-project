public int addDictionary(java.io.File dictionaryFile) throws java.io.IOException {
    final java.nio.file.Path path = java.nio.file.Paths.get(dictionaryFile.toURI());
    java.util.List<java.lang.String> listLines = java.nio.file.Files.readAllLines(path);
    int addedWords = 0;
    for (java.lang.String line : listLines) {
        final duplicatesearcher.processing.Tokenizer tokenizer = new duplicatesearcher.processing.Tokenizer(line);
        for (duplicatesearcher.Token token : tokenizer.getTokens())
            if ((dictionary.add(token)) && (tree.insert(token)))
                addedWords++;
            
        
    }
    return addedWords;
}