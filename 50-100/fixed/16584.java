public static void main(java.lang.String[] args) {
    searchEngine.Indexer.invertedIndex = searchEngine.Indexer.createIndex();
    searchEngine.Indexer.deltaCompression(searchEngine.Indexer.invertedIndex);
    try {
        searchEngine.Indexer.metaData = searchEngine.Indexer.writeRandomAccessFile(searchEngine.Indexer.invertedIndex);
    } catch (java.io.IOException e) {
        java.lang.System.err.println("IO error!");
        e.printStackTrace();
    }
    searchEngine.Indexer.writeSingleEntry(searchEngine.Indexer.metaData);
    searchEngine.Indexer.docInfoArray = searchEngine.Indexer.processDictionary(searchEngine.Indexer.dictionary);
    searchEngine.Indexer.serializeDictArray(searchEngine.Indexer.docInfoArray, "dictionary");
}