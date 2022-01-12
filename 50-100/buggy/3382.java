public void update(java.lang.Integer id, java.lang.String title, java.lang.String content) {
    try {
        org.apache.lucene.index.IndexWriterConfig indexWriterConfig = new org.apache.lucene.index.IndexWriterConfig(org.apache.lucene.util.Version.LUCENE_35, analyzer);
        org.apache.lucene.index.IndexWriter indexWriter = new org.apache.lucene.index.IndexWriter(directory, indexWriterConfig);
        org.apache.lucene.document.Document document = addDocument(id, title, content);
        org.apache.lucene.index.Term term = new org.apache.lucene.index.Term("id", java.lang.String.valueOf(id));
        indexWriter.updateDocument(term, document);
        indexWriter.close();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}