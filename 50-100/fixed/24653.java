public void delete(java.lang.Integer id) {
    try {
        org.apache.lucene.index.IndexWriterConfig indexWriterConfig = new org.apache.lucene.index.IndexWriterConfig(analyzer);
        org.apache.lucene.index.IndexWriter indexWriter = new org.apache.lucene.index.IndexWriter(directory, indexWriterConfig);
        org.apache.lucene.index.Term term = new org.apache.lucene.index.Term("id", java.lang.String.valueOf(id));
        indexWriter.deleteDocuments(term);
        indexWriter.close();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}