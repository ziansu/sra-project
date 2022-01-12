private void recreateIndexReaderAndSearcherIfNeeded() {
    try {
        org.apache.lucene.index.DirectoryReader newIndexReader = org.apache.lucene.index.DirectoryReader.openIfChanged(currentIndexReader, indexWriter, true);
        if (newIndexReader != (currentIndexReader)) {
            currentIndexReader = newIndexReader;
            currentIndexSearcher = new org.apache.lucene.search.IndexSearcher(newIndexReader);
        }
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
}