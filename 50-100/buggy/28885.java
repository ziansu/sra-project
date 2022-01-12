public boolean tryCreateIndex() throws java.io.IOException {
    if (!(org.apache.lucene.index.DirectoryReader.indexExists(_index))) {
        _config = new org.apache.lucene.index.IndexWriterConfig(_analyzer);
        docindex.IndexBuilder.w = new org.apache.lucene.index.IndexWriter(_index, _config);
        indexDirectory(QuerySystemConsts.DATASET_DIRECTORY);
        docindex.IndexBuilder._queue = new java.util.ArrayList<java.io.File>();
        docindex.IndexBuilder.w.close();
        return true;
    }else {
        return false;
    }
}